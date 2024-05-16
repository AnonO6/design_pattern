# Software design patterns implementation

This project demonstrates 6 software design patterns in action, highlighting their use cases.

## Abstract Factory pattern

The LNMIIT Gate Prep App is a Java application designed to assist students in preparing for the Graduate Aptitude Test in Engineering (GATE) examination. The application allows students to generate practice papers for different difficulty levels (easy or hard) across three major subjects: Computer Networks, Blockchain, and Mathematics.
At the backend these sections are served with questions using an abstract factory by different professors depending on the chosen difficulty level.

![SDPS Project-2](https://github.com/AnonO6/design_pattern/assets/124311066/1c3c0c2a-4298-46e7-a860-e310bfe354f5)


## Proxy design pattern

Developing a nginx server using golang and proxy design pattern. A web server such as Nginx acts as a proxy for application servers:

1. It provides controlled access to your application server.
2. It can do rate limiting.
3. It can do request caching.

![SDPS Project-4](https://github.com/AnonO6/design_pattern/assets/124311066/b43bd46a-a6cf-4093-8571-87a14bcafc04)


## State design pattern

This project implements a Requisition Management System using the State design pattern for students here at LNMIIT that need electronic parts for their project.

States and Transitions:

1. FiledState: Initial state where a requisition document is filed by a student through the lab assistant. Transitions to PurchasingStaffState upon submission.
2. PurchasingStaffState: The requisition is received by the purchasing staff. They may approve, reject, or reconsider the requisition. Upon approval, it transitions to PurchaseOfficerState.
3. PurchaseOfficerState: The requisition is reviewed by the purchase officer. They can approve, reject, or reconsider it. Upon approval, it transitions to DirectorState.
4. DirectorState: The requisition is reviewed by the director of the university. They can approve, reject, or reconsider it. Upon approval, it transitions to PurchaseManagerState.
5. PurchaseManagerState: The purchase manager manages the purchase. If successful, it transitions to ItemCollectedState. If not, it transitions back to DirectorState for reapproval.
6. ItemCollectedState: End state where the purchase is successfully completed, and the student is prompted to collect the electronic item.

![SDPS Project-5](https://github.com/AnonO6/design_pattern/assets/124311066/28ea96c0-7f6f-407d-8626-b7e5e1ce9401)


## Observer design pattern

The project is a Bus Booking System implemented in Java using the Observer design pattern. It facilitates the booking of seats for various trips between LNMIIT Jaipur and two stops in the city: Raja Park and Ajmeri Gate. The system allows users to register as observers to receive notifications about the seat status for each trip.

1. Subject (Bus): Manages the state of the bus for multiple trips, including the number of seats filled and the capacity. It allows observers to register, unregister, and notifies them about changes in seat status.

2. Observer (User): Represents users who want to be notified about the seat status for various trips. They are registered with the bus as observers and receive updates whenever there is a change in the seat status.

![SDPS Project-3](https://github.com/AnonO6/design_pattern/assets/124311066/4a008354-45fa-4e5b-af32-9059af60faa1)


## Decorator design pattern

This project implements a PUBG Player Skin decorator program. It enables players to augment their in-game avatar's appearance by adding diverse wearables such as watches, tattoos, and gun skins. The interactive driver class facilitates real-time customization of player skins, showcasing the pattern's capability to dynamically extend object functionality without altering their structure. Overall, the project showcases how the decorator pattern can be applied to enhance modularity and flexibility in gaming applications.

![PHOTO-2024-05-16-12-47-29](https://github.com/AnonO6/design_pattern/assets/124311066/dc30d4d8-3739-413c-a571-b2c34e0fe30f)

## Singleton design pattern

This project offers a centralized and efficient way to manage configuration settings in a Java application while enforcing the singleton pattern to ensure that there is only one instance of the settings manager.

![PHOTO-2024-05-16-12-47-29](https://github.com/AnonO6/design_pattern/assets/124311066/dbe6690b-5e5e-48e0-b478-2b65eeacec5f)
