Software Design Engineering Steps and UML Diagram types
=======================================================


down vote
accepted
I am trying to find these steps in a modern UML tool

This is where your thinking took a wrong turn. Those 7 design steps do not have a 1-to-1 correspondence to UML diagrams. Some steps don't use UML at all and in other steps typically multiple types of UML diagrams are used. Also, some diagrams are used in different steps with different levels of detail.

The diagrams/techniques most typically used in the different design steps are

1. Software Requirements Specification: No UML diagrams, but rather just text and sometimes tables.
2. Use Case Diagrams: Primarily textual use-case descriptions, supplemented with **UML Use-case diagrams**
3. Conceptual Model: Any diagram that shows static structure: **Class diagram**, **Package diagram**, **Composite structure diagram**
4. System Sequence Diagrams: Any diagram that shows interactions at a high level: **Sequence diagram, Activity diagram, Communication diagram, State machine diagram**
5. Contracts: No UML diagrams. Mostly tables and text.
6. Collaboration Diagrams: Any diagram that shows interactions between components: **Sequence diagram, Activity diagram, Communication diagram**
7. Design Class Diagrams: Any diagram