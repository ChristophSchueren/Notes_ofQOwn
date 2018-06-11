Module Hiererchy
================

*Every* module where components, directives, or pipes are used need to have the module that provides these listed in imports: []

It is not enough to import them in AppModule only.


Material components also **need to be imported into every module** where one of them is used. 

**You can have a module that export modules like it exports components**. This way you can combine feature modules to a bigger feature module, so you need to import only one module to get the components of a set of modules available, but you still need to add at least one import to the module where you want to use anything. –