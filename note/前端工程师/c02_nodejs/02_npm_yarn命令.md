1、安装包（如果没有指定版本号，那么安装最新版本）       
npm install -g 包名称 (全局安装)       
npm install 包名称 (本地安装)      

2、安装包的时候可以指定版本      
npm install -g 包名称@版本号      

3、卸载包       
npm uninstall -g 包名     

4、更新包（更新到最新版本）      
npm update -g 包名        

开发环境（平时开发使用的环境）     
生产环境（项目部署上线之后的服务器环境）        
--save 向生产环境添加依赖 dependencies       
--save-dev 向开发环境添加依赖 DevDependencies        

/*
    yarn工具基本使用

    安装yarn工具：npm install -g yarn

    1、初始化包
    npm init
    yarn init
    2、安装包
    npm install xxx --save
    yarn add xxx
    3、移除包
    npm uninstall xxx
    yarn remove xxx
    4、更新包
    npm update xxx
    yarn upgrade xxx
    5、安装开发依赖的包
    npm install xxx --save-dev
    yarn add xxx --dev
    6、全局安装
    npm install -g xxx
    yarn global add xxx
    7、设置下载镜像的地址
    npm config set registry url
    yarn config set registry url
    8、安装所有依赖
    npm install
    yarn install
    9、执行包
    npm run
    yarn run
*/