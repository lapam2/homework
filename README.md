1. 初始化本地版本库

```bash
#在本地仓库目录路径下执行命令
git init
#执行完，本地仓库会出现.git 文件，都是git的配置文件
```

2. 将所有文件放入暂存区

```bash
#将所有untrack文件放入暂存区
git add .
```

3. 将修改的文件放入暂存区

```bash
#将修改的README.md文件放入暂存区
git add README.md
```

4. 提交commit修改信息

```bash
git commit -m "first commit"
```

5. 推送到远程仓库

```bash
git push origin master
```





## 查看当前的远程库

```bash
#要查看当前配置有哪些远程仓库
$ git remote
origin
#执行时加上 -v 参数，你还可以看到每个别名的实际链接地址
$ git remote -v
origin    git@github.com:tianqixin/runoob-git-test.git (fetch)
origin    git@github.com:tianqixin/runoob-git-test.git (push)
```



## 提取远程仓库

```bash
#假设你配置好了一个远程仓库，并且你想要提取更新的数据，你可以首先执行 git fetch [alias] 告诉 Git 去获取它有你没有的数据
$ git fetch origin
#然后你可以执行 git merge [alias]/[branch] 以将服务器上的任何更新（假设有人这时候推送到服务器了）合并到你的当前分支。
$ git merge origin/master
```



## 推送到远程仓库

```bash
$ touch runoob-test.txt      # 添加文件
$ git add runoob-test.txt    #将修改的runoob-test.txt文件放入暂存区
$ git commit -m "添加到远程"		##提交commit信息
master 69e702d] 添加到远程
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 runoob-test.txt

$ git push origin master    # 推送到 Github
```

