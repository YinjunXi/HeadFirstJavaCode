## Decorator Pattern

> **The Decorator Pattern** attaches addtional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.


## Bullet points

- Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.

- In our designs we should allow behavior to be extended without need to modify existing code.

- Composition and delegation can often be used to add new behaviors at runtime.

- The Decorator Pattern provides an alternative to subclssing fot extending behavior.

- The Decorator Pattern involves a set of decorator classes that are uesd to wrap concrete componentd.

- Decorator classes mirror the type of the components they decorate.(In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)

- Decorators change the behavior of their components by adding new functionality before and/or after (or even in place of) method calls to the component.

- You can wrap a component with any number of decorators.

- Decorators are typically transparent to the client of the component; that is, unless the client is relying on the componnent's concrete type.

- Decorators can result in many small objects in our design, and overuse can be complex.