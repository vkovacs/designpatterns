Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.
 
Note that this pattern allows responsibilities to be added to an object, not methods to an object's interface. The interface presented to the client must remain constant as successive layers are specified.
 
Note
---
Also note that the core object's identity has now been "hidden" inside of a decorator object. Trying to access the core object directly is now a problem.
https://sourcemaking.com/design_patterns/decorator

In other words
---
Decorator classes mirror the type of the components they decorate. (In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)

Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component. 