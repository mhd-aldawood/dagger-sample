1. Create the @Modules for the objects that depend on the Activity.
2. Define a @Component that uses those @Modules and has a @Component.Builder or @Component.Factory that accepts the reference to the Activity they need.
3. Use @Singleton for the objects you want to bind to the Activity lifecycle.
4. Create the instance of this @Component in the onCreate() of the specific Activity implementation, as you did for the existing AppComponent