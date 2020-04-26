##Object-Oriented Programming 

* ###Classes
        A class is the blueprint from which individual objects are created. 
        In object-oriented terms, we say that your object is an instance of the class.

* ###Objects
        Real-world objects share two characteristics: They all have state and behavior.
        For each object that you see, ask yourself two questions: 
        
        1: What possible states can this object be in?
        2: What possible behavior can this object perform?.

* ###Access Modifiers
        Access level modifiers determine whether other classes can use a particular
        field or invoke a particular method.
    
        1: Private 
        2: Public 
        3: Protected
        
     ![Modifier Image](https://miro.medium.com/max/1200/1*GKGirEJ5-PaSz2bzGlRTjw.png)            
            

* ###Encapsulation
        Encapsulation normally hide states and present behavior to communicate with the outside world
        
        1: bind the data            
        2: methods to manipulate that data together in a single unit (class).
        
        
* ###Inheritance
        Inheritance commonly used state and behavior from other subclass
        Inheritance IS A relationship between objects
        Class that is derived from another class is called a subclass
        Class from which the subclass is derived is called a superclass
        super keyword is used to refer to the SuperClass members from inside the Subclass
        super keyword allow us to use:
        
        1: Accessing Parent Class Fields
        2: Calling a Parent Class Method
        3: Using with Constructors
        
    **Five types of inheritance**
        
        1: Single
        2: Multi-level
        3: Hierarchical
        4: Multiple
        5: Hybrid
     
     ![Types of Inheritance](https://simplesnippets.tech/wp-content/uploads/2018/04/java-types-of-inheritance-1024x670.jpg)
    
    **Advantages of Inheritance** 
    
        1: Re-usability Inheritance makes the code reusable
        2: Avoiding Duplication of Code you don’t need to duplicate the code
        

* ###Polymorphism
        1: Polymorphism is a combination of two Greek words, Poly means many and Morph means forms.
        2: In programming it refers to the same object exhibiting different forms and behaviors.
        
     ![Polymorphism](https://dkb46014en6d6.cloudfront.net/tutorials/wp-content/uploads/sites/2/2020/02/example-of-polymorphism-in-java.jpg)       
     
* ###Abstraction & Interfaces
        Abstraction in Object-Oriented Programming refers to showing only the essential features of an object
        to the user and hiding the inner details to reduce complexity. It can be put this way that
        the user only has to know “what an object does?” rather than “how it does?”.
      
        An interface can be thought of as a contract that a class has to fulfill while implementing an interface.
        According to this contract, the class that implements an interface has to @Override all the abstract methods
        declared in that very interface.
     
     **How to Achieve Abstraction**
        
        1: Abstract Classes
        2: Interfaces
        
* ###Composition, Aggregation and Association
       
    **Association** 
        
        In object-oriented programming, association is the common term used for both the has-a and part-of relationships
        but is not limited to these. When we say that two objects are in an association relationship, this is a generic
        statement which means that we don’t worry about the lifetime dependency between the objects.
        
    **Aggregation**
        
        Aggregation follows the has-A model. This creates a parent-child relationship between two classes, with one 
        class owning the object of another. In aggregation, the lifetime of the owned object does not depend on the
        lifetime of the owner. Class A and Class B have a has-a relationship if one or both need the other’s object to 
        perform an operation, but both class objects can exist independently of each other. This implies that a class 
        has-a reference to an object of the other class but does not decide the lifetime of the other class’s referenced
        object.
        
    **Composition**
        
        is the practice of creating other class objects in your class. In such a scenario, the class which creates the 
        object of the other class is known as the owner and is responsible for the lifetime of that object.
        Composition relationships are Part-of relationships where the part must constitute part of the whole object.
        In composition, the lifetime of the owned object depends on the lifetime of the owner.