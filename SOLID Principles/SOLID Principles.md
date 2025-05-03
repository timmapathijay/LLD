# S.O.L.I.D Principles 
S - Single Responsibility Principle
O - Open / Closed Principle
L - Liskov Substitution Principle
I - Interface Segmented Principle
D - Dependency Inversion Principle 

Advantages of following these Principles: 
- Help us to write better code
1. Avoid Duplicate Code
2. Easy to maintain & understand 
3. Flexible software 
4. Reduce Complexity 

--> S :- Single Responsibility Principle 
- A class should have only one reason to change.

--> O :- Open / Closed Principle
- Open for extension but closed for modification 

--> L :- Liskov Substitution Principle
If class B is a subtype of class A then we should be able to replace object of A with B without breaking the 
behaviour of the program.
- Subclass should extend the capability of parent class not narrow it down.
- In parent class put only generic methods.

--> I :- Interface Segmented Principle
Interfaces should be such that client should not implement unnecessary functions they do not need.

--> D :- Dependency Inversion Principle
Class should depend on interfaces rather than concrete classes.
