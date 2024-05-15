# Software design patterns implementation

This project demonstrates 6 software design patterns in action, highlighting their use cases.

## Abstract Factory pattern

    The LNMIIT Gate Prep App is a Java application designed to assist students in preparing for the Graduate Aptitude Test in Engineering (GATE) examination. The application allows students to generate practice papers for different difficulty levels (easy or hard) across three major subjects: Computer Networks, Blockchain, and Mathematics.
    In the software design it utilizes abstract factory to choose amongst the sections of paper and professor for that section based on difficulty.
    P.S. Bhairvi sir's section is open book

## Proxy design pattern

    Developing a nginx server. A web server such as Nginx acts as a proxy for application servers:

    1. It provides controlled access to your application server.
    2. It can do rate limiting.
    3. It can do request caching.

## Builder design pattern

## Singleton design pattern

    This project offers a centralized and efficient way to manage configuration settings in a Java application while enforcing the singleton pattern to ensure that there is only one instance of the settings manager.

## State design pattern

    This project implements a Requisition Management System using the State design pattern for students here at LNMIIT that need electronic parts for their project.

    States and Transitions:

    1. FiledState: Initial state where a requisition document is filed by a student through the lab assistant. Transitions to PurchasingStaffState upon submission.
    2. PurchasingStaffState: The requisition is received by the purchasing staff. They may approve, reject, or reconsider the requisition. Upon approval, it transitions to PurchaseOfficerState.
    3. PurchaseOfficerState: The requisition is reviewed by the purchase officer. They can approve, reject, or reconsider it. Upon approval, it transitions to DirectorState.
    4. DirectorState: The requisition is reviewed by the director of the university. They can approve, reject, or reconsider it. Upon approval, it transitions to PurchaseManagerState.
    5. PurchaseManagerState: The purchase manager manages the purchase. If successful, it transitions to ItemCollectedState. If not, it transitions back to DirectorState for reapproval.
    6. ItemCollectedState: End state where the purchase is successfully completed, and the student is prompted to collect the electronic item.
