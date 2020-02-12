1、终端命令
- calc 打开计算机
- sysdm.cpl 打开环境变量设置窗口

2、在Node.js中没有window对象，但是有一个类似的对象global，访问全局成员的时候可以省略global
- global.console.log(123456);

3、let
- let声明的变量不存在预解析
- let声明的变量不允许重复（在同一个作用域内）

4、const
- const用来声明常量
- const声明的常量不允许重新赋值
- const声明的常量必须初始化

5、 解构赋值
- 数组的解构赋值       
```
let [a,b,c] = [1,2,3];       
console.log(a,b,c);
``` 
- 对象的解构赋值
```
let {foo,bar} = {foo : 'hello',bar : 'hi'};
```

- 字符串的解构赋值
```
let [a,b,c,d,e,length] = "hello";
```

- 反引号表示模板，模板中的内容可以有格式，通过${}方式填充数据
```
let fn = function(info){
    return info;
}
let tpl = `
    <div>
        <span>${obj.username}</span>
        <span>${obj.age}</span>
        <span>${obj.gender}</span>
        <span>${1+1}</span>
        <span>${fn('nihao')}</span>
    </div>
`;
console.log(tpl);
```

6、...扩展运算符
```
// 合并数组
let arr1 = [1,2,3];
let arr2 = [4,5,6];
let arr3 = [...arr1,...arr2];
console.log(arr3);
```

7、箭头函数的注意事项：
- 1、箭头函数中this取决于函数的定义，而不是调用
```
function foo(){
 // 使用call调用foo时，这里的this其实就是call的第一个参数
  console.log(this);
  setTimeout(()=>{
     console.log(this.num);
 },100);
  // }
  // foo.call({num:1});
  ```
- 2、箭头函数不可以new
 ```
  let foo = () => { this.num = 123;};
  //new foo();
```
- 3、箭头函数不可以使用arguments获取参数列表，可以使用rest参数代替
```
  let foo = (a,b) => {
  console.log(a,b);
  console.log(arguments);//这种方式获取不到实参列表
 }
  foo(123,456);
  let foo = (...param) => {
      console.log(param);
  }
  foo(123,456 );
```