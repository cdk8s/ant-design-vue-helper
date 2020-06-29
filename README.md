
## 请留意

- 插件已发布官网仓库：<https://plugins.jetbrains.com/plugin/14623-ant-design-vue-helper>
- CDK8S Github：<https://github.com/cdk8s>
- 微信公众号：`cd-k8s`
- 微信：`judasn`

## 环境准备

- 当前时间：2020-06
- 官网说明：<https://www.jetbrains.org/intellij/sdk/docs/basics/getting_started.html>
- IntelliJ IDEA 2020.1.2 旗舰版
- 插件 Plugin DevKit 必装
- 插件 Gradle 必装，以及 Gradle 开发环境
- 设置 Plugin SDK：<https://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/setting_up_environment.html>
- 新建项目：File > New > Project... > Gradle > 勾选 Java 和 IntelliJ Platform Plugin > 下一步

## 文档

- 官网文档：<https://www.jetbrains.org/intellij/sdk/docs/intro/welcome.html>
- 官网示例：<https://github.com/JetBrains/intellij-sdk-code-samples>
- 其他文档示例：
    - <https://blog.csdn.net/dc_726/article/details/14139155>
    - <https://blog.xiaohansong.com/idea-plugin-development.html>
    - <https://github.com/jiaolong1021/ElementPlugin>

## 运行调试方法

- 选择右侧 Gradle > Tasks > intellij > runIde > 右键 Debug xxxxxx，会启动一个新的 IntelliJ IDEA 自动帮我们安装正在开发的插件进行调试
- 并且当前环境是 debug 状态，可以用来调试代码


## 打包

- 选择右侧 Gradle > Tasks > build > jar，项目根目录会有一个 build 目录生成，里面有一个 libs 子目录可以看到一个 jar 文件。
- 在 IntelliJ IDEA 项目里面可能会看不到，被隐藏了，需要打开电脑文件管理器查看这个目录

