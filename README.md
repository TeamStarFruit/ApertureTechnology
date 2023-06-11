# 代码结构			
| 内容  | 位置                           | 命名形式       |
|-----|------------------------------|------------|
| 注册  | 	放置于init文件夹                  | 	Mod+注册名+s |
| 包名  | 	org.starfruit.aperturetech	 |	
| 主类  | 	*.                          | 	PortalMod   |



# 风格规范 
| 代码风格              | 部分例子                            |
|-------------------|---------------------------------|
| 括弧		              | Kernighan风格                     |
| 所有的mixin方法前面要加上前缀 | 		portal_                         |
| mixin的方法如果添加内容则	  | 	portal_addedX                    |
| Mixin类命名为	        | 	MixinXXX	MixinEntity           |
| 变量命名规则	           | 	小驼峰	doSomething                |
| 类名命名规则	           | 	大驼峰	UpperStream                |
| 枚举命名规则	           | 	E+内容	EBlockState               |
| 未完成内容需要加注释	       | 	//TODO 内容	//TODO - will...     |
| 事件钩子方法的mixin命名规则	 | 	callXXEvent	callItemSpawnEvent |
| 事件钩子类命名规则	        | 	内容+作用+Event	BlockDropEvent     |
| 代码过长需要进行断行        |                                 |
| 不用连续空格		          |                                 |
| 相隔需要空格		          |                                 |
| 注释统一用英文	          |

# 提交(commit)规范
| 类型         | 解释                         |
|------------|----------------------------|
| feat:      | 新功能 feature                |
| fix        | 		修复bug,一次提交直接修复问题         |
| to 	       | 	修复bug,多次提交修复问题            |
| docs	      | 	             文档           |
| style	     | 	格式（不影响代码运行的变动）            |
| refactor	  | 	重构（即不是新增功能，也不是修改bug的代码变动） |
| perf	      | 	优化相关，比如提升性能、体验            |
| test	      | 	增加测试                      |
| chore	     | 	构建过程或辅助工具的变动              |
| revert	    | 	回滚到上一个版本                  |

