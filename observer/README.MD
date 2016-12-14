 The observer pattern is a software design pattern in which an object, called the **subject**, maintains a list of its dependents, called **observers**, and **notifies them automatically of any state changes**, usually by calling one of their methods. 
 
 It is mainly used to implement distributed event handling systems. The Observer pattern is also a key part in the familiar model–view–controller (MVC) architectural pattern
 
 When implementing the Observer pattern, there are two main approaches to consider: the **'push' model** and the **'pull' model**.
 
 In the **'push' model**, the subject (i.e. the Observable) sends the observer on notification all the data it will need. The observer doesn't need to query the subject for information. In the **'pull' model**, the subject merely notifies the observer that something happaned, and the observer queries the subject based to get the information it needs.