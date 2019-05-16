# 开闭原则:

1. 软件中的对象（类，模块，函数等等）应该对于扩展是开放的，但是对于修改是封闭的
2. 用抽象构建框架,用实现扩展细节 
3. 有点提高可复用性和可维护性

# 依赖倒置原则:

- 定义:高层模块不应该依赖低层模块,二者都应该依赖其抽象
- 抽象不应该依赖细节;细节应该依赖抽象
- 针对接口编程,不要针对实现编程
- 优点:可以减少类间的耦合性,提高系统稳定性,提高代码可读性可维护性,可降低修改程序造成的风险

# 单一职责原则:

- 定义:不要存在多于一个导致类变更的原因
- 一个类/接口/方法只负责一项职责
- 优点:降低类的复杂度、提高类的可读性性、提高系统的可维护性、降低变更引起的风险

# 接口隔离原则

- 定义:用于多个专门的接口,而不使用单一的总接口,客户端不应该依赖它不需要的接口
- 一个类对一个类的依赖应该建立在最小的接口上
- 建立单一的接口,不要建立庞大臃肿的接口
- 尽量细化接口,接口中的方法尽量少

# 迪米特原则

- 定义:一个对象应该对其他对象保持最少的了解(最少知道原则)
- 尽量降低类与类之间的耦合
- 优点:降低类之间的耦合
- 特点:强调只和朋友交流,不和陌生人说话

[^朋友]: 出现在成员变量、方法输出、输出参数中的类称为成员朋友类,出现在方法体内部的类不属于朋友类

