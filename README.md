# TabooLib SDK

## 为什么重启？

1. 因为不适应TabooLib插件
2. IDEA插件总出错所以要有一个项目兜底

## 构建发行版本

发行版本用于正常使用, 不含 TabooLib 本体。
```
./gradlew build
```
## 构建开发版本
开发版本包含 TabooLib 本体, 用于开发者使用, 但不可运行。
```
./gradlew taboolibBuildApi -PDeleteCode
```
> 参数 -PDeleteCode 表示移除所有逻辑代码以减少体积。
