//防火墙
一直用CentOS 6 习惯了，一下没适应过来。防火墙配置后执行service iptables save 出现"Failed to restart iptables.service: Unit iptables.service failed to load: No such file or directory."错误,在CentOS 7或RHEL 7或Fedora中防火墙由firewalld来管理，当然你可以还原传统的管理方式。或则使用新的命令进行管理。
假如采用传统请执行一下命令：

systemctl stop firewalld
systemctl mask firewalld
 
并且安装iptables-services：
1
yum install iptables-services
设置开机启动：
1
systemctl enable iptables

systemctl [stop|start|restart] iptables
#or
service iptables [stop|start|restart]
 
service iptables save
#or
/usr/libexec/iptables/iptables.init save
//防火墙

//Java安装
查看CentOS自带JDK是否已安装。
输入：yum list installed |grep java。
若有自带安装的JDK，如何卸载CentOS系统自带Java环境？
卸载JDK相关文件输入：yum -y remove java-1.7.0-openjdk*。
卸载tzdata-java输入：yum -y remove tzdata-java.noarch。
当结果显示为Complete！即卸载完毕。
//Java安装

//tomcat安装
[root@admin local]# cd /usr/local  
[root@admin local]# wget http://apache.fayea.com/apache-mirror/tomcat/tomcat-7/v7.0.57/bin/apache-tomcat-7.0.57.tar.gz  
[root@admin local]# tar -zxv -f apache-tomcat-7.0.29.tar.gz // 解压压缩包  
[root@admin local]# rm -rf apache-tomcat-7.0.29.tar.gz // 删除压缩包  
[root@admin local]# mv apache-tomcat-7.0.29 tomcat  //修改文件夹名

[root@admin ~]# /usr/local/tomcat/bin/startup.sh //启动tomcat

8080端口开启
[root@admin ~]# vi + /etc/sysconfig/iptables
-A RH-Firewall-1-INPUT -m state --state NEW -m tcp -p tcp --dport 8080 -j ACCEPT
service iptables restart
//tomcat安装

//MySQL安装
a. 检查MySQL及相关RPM包，是否安装，如果有安装，则移除（rpm –e 名称）
rpm -qa | grep -i mysql //grep的-i选项表示匹配时忽略大小写
rpm -e mysql-libs-5.1.61-4.el6.x86_64 --nodeps //载时使用了--nodeps选项，忽略了依赖关系
yum list installed |grep -i mysql 
yum -y remove mysql-libs*
b. 下载Linux对应的RPM包，如：CentOS6.4_64对应的RPM包，如下
MySQL-client-5.6.15-1.el6.x86_64.rpm
MySQL-devel-5.6.15-1.el6.x86_64.rpm
MySQL-server-5.6.15-1.el6.x86_64.rpm
c. 安装MySQL
[root@localhost rpm]# rpm -ivh MySQL-server-5.6.15-1.el6.x86_64.rpm
[root@localhost rpm]# rpm -ivh MySQL-devel-5.6.15-1.el6.x86_64.rpm
[root@localhost rpm]# rpm -ivh MySQL-client-5.6.15-1.el6.x86_64.rpm 
#修改配置文件位置
[root@localhost rpm]# cp /usr/share/mysql/my-default.cnf /etc/my.cnf
如果直接点击rpm包安装会得到错误提示。因为CentOS的默认数据库已经不再是MySQL了，而是MariaDB，为什么呢？
MariaDB数据库管理系统是MySQL的一个分支，主要由开源社区在维护，采用GPL授权许可。
开发这个分支的原因之一是：甲骨文公司收购了MySQL后，有将MySQL闭源的潜在风险，因此社区采用分支的方式来避开这个风险。
MariaDB的目的是完全兼容MySQL，包括API和命令行，使之能轻松成为MySQL的代替品。
rpm -qa | grep -i mariadb
将它们统统强制性卸载掉：
[root@bogon 桌面]# rpm -e --nodeps mariadb-libs-5.5.35-3.el7.x86_64
[root@bogon 桌面]# rpm -e --nodeps mariadb-5.5.35-3.el7.x86_64
[root@bogon 桌面]# rpm -e --nodeps mariadb-server-5.5.35-3.el7.x86_64
4. 启动MYSQL
[root@bogon 桌面]# service mysql start
查看MySQL运行状态：
[root@bogon 桌面]# service mysql status
5. 默认root用户登录MYSQL
[root@bogon 桌面]# mysql -u root -p
(1) 停止MySQL服务
[root@bogon 桌面]# service mysql stop
6. 初始化MySQL及设置密码
cat /root/.mysql_secret  #查看root账号密码,密码动态生成
[root@localhost ~]# mysql -u root –p qKTaFZnl
mysql> SET PASSWORD = PASSWORD('123456');    #设置密码为123456
mysql> exit
[root@localhost ~]# mysql -u root -p 123456
7. 允许远程登陆
mysql> use mysql;
mysql> select host,user,password from user;
mysql> update user set password=password('123456') where user='root';
mysql> update user set host='%' where user='root' and host='localhost';
mysql> flush privileges;
mysql> exit
8. 设置开机自启动
[root@localhost ~]# chkconfig mysql on
[root@localhost ~]# chkconfig --list | grep mysql
9. MySQL的默认安装位置
/var/lib/mysql/               #数据库目录
/usr/share/mysql              #配置文件目录
/usr/bin                     #相关命令目录
/etc/init.d/mysql              #启动脚本
10. 修改字符集和数据存储路径
在[client]下添加
default-character-set=utf8
在[mysqld]下添加
default-character-set=utf8（mysql 5.5 版本添加character-set-server=utf8）

配置/etc/my.cnf文件,修改数据存放路径、mysql.sock路径以及默认编码utf-8.
[client]
password        = 123456
port            = 3306
default-character-set=utf8
[mysqld]
port            = 3306
character_set_server=utf8
character_set_client=utf8
collation-server=utf8_general_ci
#(注意linux下mysql安装完后是默认：表名区分大小写，列名不区分大小写； 0：区分大小写，1：不区分大小写)
lower_case_table_names=1
#(设置最大连接数，默认为 151，MySQL服务器允许的最大连接数16384; )
max_connections=1000
11. 查看字符集
show variables like '%collation%';
show variables like '%char%';

12. 创建用户
例子：mysql>grant select,insert,update,delete,create,drop on test.hr to john@192.168.10.1 identified by '123';
说明：给主机为192.168.10.1的用户john分配可对数据库test的hr表进行select,insert,update,delete,create,drop等操作的权限，并设定口令为123。
mysql>grant all privileges on test.* to joe@192.168.10.1 identified by '123';
说明：给主机为192.168.10.1的用户john分配可对数据库test所有表进行所有操作的权限，并设定口令为123。
mysql>grant all privileges on *.* to john@192.168.10.1 identified by '123';
说明：给主机为192.168.10.1的用户john分配可对所有数据库的所有表进行所有操作的权限，并设定口令为123。
mysql>grant all privileges on *.* to john@localhost identified by '123';
说明：用户john分配可对所有数据库的所有表进行所有操作的权限，并设定口令为123。
完成用户的创建后，请记得刷新系统权限表；
mysql>flush privileges;
CREATE DATABASE `agency_db`  
CHARACTER SET 'utf8';
grant select,insert,update,delete,create,drop on agency_db.* to 'john'@'%' identified by '123!@#456';
update user set host='%' where user='john' and host='localhost';
//MySQL安装

//nginx
server {
    listen       8000;
    server_name  localhost;

    location ~ .*\.(gif|jpg|jpeg|png)$ {
        root   E:/images/;
    }

    access_log  E:/images/logs/log_access.log;
}
//nginx