# PaprikaMVVM-Modules

<img src="https://github.com/HariAgus/PaprikaMVVM-Modules/blob/master/clean_architecture.png" width="400"/>

Layers of Clean Architecture
There are different opinions about how many layers Clean Architecture should have. The architecture doesn’t define exact layers but instead lays out the foundation. The idea is that you adapt the number of layers to your needs.

To keep things simple, you’ll use five layers:

- Presentation: A layer that interacts with the UI.
- Use cases: Sometimes called interactors. Defines actions the user can trigger.
- Domain: Contains the business logic of the app.
- Data: Abstract definition of all the data sources.
- Framework: Implements interaction with the Android SDK and provides concrete implementations for the data layer.

<br/>

## Some points are applied :
- [x] Modular
- [x] Dependency Injection (Dagger Hilt)
- [x] MVVM (Model View View Model)
- [x] Use Case
- [x] Clean Architecture
- [x] Flow 
- [x] Data Mocking 
