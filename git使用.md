# git本地化操作

* 初始化用户名：`git config --global user.name 'Air75'`
* 初始化邮箱：`git config --global user.email '1916790564@qq.com'`
* 初始化仓库：``，会得到一个`.git`文件，Mac使用`shift+commend+.`查看隐藏文件。
* 查看文件status：`git status`
* 提交文件到暂存区：`git add test.java`
* 提交文件到仓库：`git commit -m '这是描述'`
* 修改文件：
    *  先将文件修改之后，再次运行`git add test.java`和`git commit -m '这是修改之后的文件'`
*  删除文件：`git rm test.java`和`git commit -m '删除文件'`

# git管理远程仓库

* 作用：备份，共享
* git克隆
    * 目的：将远程仓库（github对应的项目）赋值到本地
    * 代码：`git clone 仓库地址`，例如，`git clone https://github.com/Air75/Little-CodeHouse.git`

