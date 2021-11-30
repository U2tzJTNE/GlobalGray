# GlobalGray

[![](https://jitpack.io/v/U2tzJTNE/GlobalGray.svg)](https://jitpack.io/#U2tzJTNE/GlobalGray)

一个可以让应用全局变灰的库。

## Demo

![demo](http://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/1a1ceeb59d774935b3ef6fdc001f9856~tplv-k3u1fbpfcp-zoom-1.image)

## 依赖

在你项目的build.gradle文件中添加jitpack的仓库

```groovy
allprojects {
	repositories {
		...
        maven { url 'https://jitpack.io' }
    }
}
```

然后在你要使用的模块中添加如下依赖：

```groovy
dependencies {
    implementation 'com.github.U2tzJTNE:GlobalGray:1.0'
}
```

## 代码示例

Application的onCreate中调用：

```java
GlobalGray.enable(true);
```

## 已知存在的问题

1. 开启了View的硬件加速，可能会存在兼容性问题
2. 对于SurfaceView和Textureview以及其子类无效

对于问题1笔者在项目中暂未遇到问题，如果读者朋友们在项目中遇到兼容性问题，欢迎留言；

对于问题2其原因是因为这两个组件内部有独立的绘图表面（Surface），笔者目前未想到好的解决方案，如果有思路欢迎一块交流。

## 博客地址

https://juejin.cn/post/6892277675012915207
