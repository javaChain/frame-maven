Maven学习之路
maven插件mybatis-generator生成代码配置
https://my.oschina.net/u/1763011/blog/324106

项目 右键--》run as --》 maven bulid --》弹出对话框 --》在goals中输入mybatis-generator:generate 或者 点击select --》选择你的mybatis插件 --》apply --》run

redis下载
https://github.com/MSOpenTech/redis/releases
打开一个 cmd 窗口 使用cd命令切换目录到 C:\redis 运行 redis-server.exe redis.windows.conf 。


redis安装
http://www.runoob.com/redis/redis-install.html

SSM框架——详细整合教程（Spring+SpringMVC+MyBatis）
http://blog.csdn.net/gebitan505/article/details/44455235/

maven 启动 各种jar包加载不出来。解决方案：
选中项目properties---> deployment assembly , add ,java build path entries , Maven Dependencies . 
这样才能在发布时,将maven的jar包一起放到服务器中.
![maven启动1](http://wx4.sinaimg.cn/mw690/0063lLoQgy1fdmch1t39yj31hc0w6thf.jpg)
![maven启动2](http://wx3.sinaimg.cn/mw690/0063lLoQgy1fdmch2vh22j31hc0wgtib.jpg)

 
1. 工程运行环境
JDK:1.7
TOMCAT7
Windows7/Eclipse luna
1.解压redis.zip文件夹,然后打开一个 cmd 窗口 使用cd命令切换解压目录到 C:\redis 运行 redis-server.exe redis.windows.conf 。
<p>打开方式:打开Eclipse,选择File->import->Existing Maven Project,找到项目的pom文件，导入即可。（注意，要安装好Maven,建议直接下一个javaee版本的eclipse,它集成了maven）</p>
2. 后台使用到的框架
Spring+SpringMVC+Mybatis+Maven+redis
日志使用：logback
数据库使用:Mysql
后台分页使用：PageHelp(与Mybatis一起使用)
3. 前台使用
框架：JSP(HPLUS模版)
4. 数据源配置
数据库配置修改
请修改POM.XML中的profiles里的内容，将jdbc_url、jdbc_username、jdbc_password修改成自己的，示例如下：
driver=com.mysql.jdbc.Driver
url=jdbc:mysql://192.168.1.143:3306/dubbo_dev?useUnicode=true&amp;characterEncoding=UTF-8
username=root
password=root

spring-rmi配置：
http://note.youdao.com/noteshare?id=9fa23ebbb535471fc4239cab8a525f56&sub=09C0292DDE574FD299A22903FABAF368

登录用户名密码
admin/123456

