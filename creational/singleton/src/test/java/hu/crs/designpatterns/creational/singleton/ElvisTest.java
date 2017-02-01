package hu.crs.designpatterns.creational.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ElvisTest {

    @Test
    public void testElvis() {
        Assert.assertEquals(Elvis.getInstance(), Elvis.getInstance());
    }

    @Test
    public void testElvisMultipleThreads() throws ExecutionException, InterruptedException {
        final int MAX_THREAD = 10000;

        Set<Future<Elvis>> futureSet = new HashSet<>();

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i=0; i< MAX_THREAD; i++) {
            Callable<Elvis> callable = new ElvisCallable();
            Future<Elvis> future = pool.submit(callable);
            futureSet.add(future);
        }

        Future<Elvis> elvisFuture = null;
        for (Future<Elvis> future : futureSet) {
            if (elvisFuture == null) {
                elvisFuture = future;
            } else {
                Assert.assertEquals(elvisFuture.get(), future.get());
            }
        }

    }

    private class ElvisCallable implements Callable<Elvis> {
        @Override
        public Elvis call() throws Exception {
            return Elvis.getInstance();
        }
    }

}
