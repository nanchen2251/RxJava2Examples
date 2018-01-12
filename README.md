# RxJava2Examples
### RxJava2 Examples——它可能是从RxJava1跳到RxJava2（学习RxJava2）最好的例子Demo
#### 号外：听说「nanchen」搞了一个 Android 开发者的免费福利，不行你看：[给 Android 开发者的一点福利：免费模拟面试](http://mp.weixin.qq.com/s/WRdSmGxwDp-CpQcSlmJYlg)

> RxJava 1.x 到 RxJava 2.x 的无缝对接  
无需学习 RxJava 1.x, 直接学习 RxJava 2.x  
完备齐全的操作符示例  
支持与 Retrofit 交互处理示例  
Activity 基类封装处理 

### 文章链接：
[这可能是最好的 RxJava 2.x 入门教程（完结版）](http://www.jianshu.com/p/0cd258eecf60)<br>
[这可能是最好的 RxJava 2.x 入门教程（一）](http://www.jianshu.com/p/a93c79e9f689)<br>
[这可能是最好的 RxJava 2.x 入门教程（二）](http://www.jianshu.com/p/b39afa92807e)<br>
[这可能是最好的 RxJava 2.x 入门教程（三）](http://www.jianshu.com/p/e9c79eacc8e3)<br>
[这可能是最好的 RxJava 2.x 入门教程（四）](http://www.jianshu.com/p/c08bfc58f4b6)<br>
[这可能是最好的 RxJava 2.x 入门教程（五）](http://www.jianshu.com/p/81fac37430dd)<br>


### 关于作者
    南尘<br>
    四川成都<br>
    [其它开源](https://github.com/nanchen2251/)<br>
    [个人博客](https://nanchen2251.github.io/)<br>
    [简书](http://www.jianshu.com/u/f690947ed5a6)<br>
    [博客园](http://www.cnblogs.com/liushilin/)<br>
    交流群：118116509 <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=e6ad4af66393684e1d0c9441403b049d2d5670ec0ce9f72150e694cbb7c16b0a"><img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="Android神技侧漏交流群" title="Android神技侧漏交流群"></a>( 点击图标即可加入 )<br>
    欢迎投稿(关注)我的唯一公众号，公众号搜索 nanchen 或者扫描下方二维码：<br>
    ![](http://images2015.cnblogs.com/blog/845964/201707/845964-20170718083641599-1963842541.jpg)
    

### Just a gif
![](https://github.com/nanchen2251/RxJava2Examples/blob/master/GIF.gif)

### RxJava 1.x 到 RxJava 2.x 变化一览

RxJava 1.x -> RxJava 2.x

* `onCompleted` -> `onComplete` - without the trailing d
* `Func1` -> `Function`
* `Func2` -> `BiFunction`
* `CompositeSubscription` -> `CompositeDisposable`
* `limit` operator has been removed - Use `take` in RxJava2
* and much more.

### 一些操作符的解释

* `Map` -> transform the items emitted by an Observable by applying a function to each item
* `Zip` -> combine the emissions of multiple Observables together via a specified function and emit single items for each combination based on the results of this function
* `Filter` -> emit only those items from an Observable that pass a predicate test
* `FlatMap` -> transform the items emitted by an Observable into Observables, then flatten the emissions from those into a single Observable
* `Take` -> emit only the first n items emitted by an Observable
* `Reduce` -> apply a function to each item emitted by an Observable, sequentially, and emit the final value
* `Skip` -> suppress the first n items emitted by an Observable
* `Buffer` -> periodically gather items emitted by an Observable into bundles and emit these bundles rather than emitting the items one at a time
* `Concat` -> emit the emissions from two or more Observables without interleaving them
* `Replay` -> ensure that all observers see the same sequence of emitted items, even if they subscribe after the Observable has begun emitting items
* `Merge` -> combine multiple Observables into one by merging their emissions

### 尽情地下载运行，开始感受RxJava 2.x 的强大魅力吧~

### 为这个例子pull你的伟大代码，加入分享这个大家庭，Just to do!


### 该例子借鉴了以下项目：
 * [https://github.com/amitshekhariitbhu/RxJava2-Android-Samples](https://github.com/amitshekhariitbhu/RxJava2-Android-Samples) 

    
#### 有码走遍天下 无码寸步难行（引自网络）

> 1024 - 梦想，永不止步!  
爱编程 不爱Bug  
爱加班 不爱黑眼圈  
固执 但不偏执  
疯狂 但不疯癫  
生活里的菜鸟  
工作中的大神  
身怀宝藏，一心憧憬星辰大海  
追求极致，目标始于高山之巅  
一群怀揣好奇，梦想改变世界的孩子  
一群追日逐浪，正在改变世界的极客  
你们用最美的语言，诠释着科技的力量  
你们用极速的创新，引领着时代的变迁  
  
------至所有正在努力奋斗的程序猿们！加油！！  
    
## Licenses
```
 Copyright 2017 nanchen(刘世麟)

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
```


