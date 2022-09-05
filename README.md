# 健身俱乐部管理系统



## 需求分析

**1 功能性需求分析**

**1.1前台功能**

1.1.1俱乐部信息展示

健身俱乐部的首页进行展示一些俱乐部的基本信息、图片等。能够实现对各模块的跳转。

1.1.2 用户注册

用户注册需要提供用户信息录入功能，并将用户信息持久化。

用户注册界面，由用户登录界面的按钮跳转。用户需要输入用户姓名，用户手机号，用户性别来进行注册。每位注册用户拥有独特的id，是唯一区分用户的字段。用户注册的信息是管理用户的基础，通过注册时信息可以获得用户的信息和状况，便于进一步分析用户真正的需求，进行个性化定制服务

1.1.3 用户登录

用户登录需要提供用户登录账号的入口，并能在账号完成登录后显示用户信息。

用户管理界面，未登陆状态默认显示登录界面，用户可以通过输入手机号和密码进行登录。同时在界面下方有用户注册的入口按钮。登录界面需简洁明了，方便用户使用。在用户登录后，登录界面应显示用户的所有基本信息，并提供编辑渠道，方便用户修改个人信息。

1.1.4 预约课程

预约教练界面需要显示课程信息和对应教练信息。

管理员可以增删改课程，教练可以查看自己被安排至哪个课程。

会员在界面需依次选择课程和教练，其中，课程包含了具体时间。预约时，若会员卡积分不足则提示充值；若积分足够，后台对会员卡的积分进行扣除，并能够在选择后反馈预约成功信息。

预约成功后，后台对课程表、预约表更新，页面中该课程变为不可选。

1.1.5 健身预约

健身预约界面提供可选时间，为本周和下周共14天的早中晚3个时间段。可以查看具体时间的预约人数。

1.1.6 会员留言

留言板界面，会员可对平台服务、教练以及课程等内容进行留言，也可分享自己的健身效果，其他会员和管理员均可查看。

1.1.7 会员业务办理

会员可进行会员充值请求以及付款操作，后台会对充值操作进行统计，会员可查看自己账户积分；会员可根据自己的个人情况预约教练或课程，后台会对预约操作进行登记，预约成功会从账户积分余额中扣除相关积分，会员可查看自己积分消费记录。

1.1.8 个人信息页面

会员和教练可以查看自己的基本个人信息并进行修改。

**1.2后台功能**

1.2.1会员消费统计

会员消费统计页面,主要显示总会员数以及每个会员每次充值或消费后会员卡上的积分余额，并统计该会员的总消费和总充值，每次充值或消费完都会产生一条账户余额变更记录，方便俱乐部流水的统计和会员的查看。（可通过Echarts以饼状图、树状图等方式呈现）

1.2.2会员信息管理

会员信息管理是对会员基本信息的管理，包括查看和冻结。会员基本信息是指会员的会员号、姓名、余额、预约的课程等基础信息。

1.2.3教练信息管理

包括教练基本信息的变更和查询，教练信息的发布，指导课程的确定，教练的聘用、解聘等。

1.2.4健身课程管理

健身课程基本信息包括健身内容，指导教练，收费标准等。后台能够对健身课程进行增删改查等功能，同时可以按不同的查询条件来查询健身课程并打印，方便会员进行选择。

1.2.5权限管理

管理员：可注册、登录、查看和删除用户信息（但无法修改用户信息）、添加/修改/删除课程信息。

用户：可注册、登录、注销；可修改密码；可查看或修改用户信息（账户金额不可修改）；可查看教练、课程信息；可充值；可预约教练或课程。

教练：注册、登录；可修改密码；可查看和修改个人信息、查看课程信息；查看留言。

1.2.6健身器材管理

健身器材的基本信息包括器材名称、器材说明、库存数量、购买单价等，管理员可对健身器材的信息进行变更和查询，当库存数量不足时及时进行补充，以提供给会员良好的使用体验。

**2 非功能性需求（质量需求）分析**

2.1 可用性

过多用户同时使用系统导致系统崩溃时，能够尽快修复且重新启动系统

2.2 可修改性

在开发过程以及开发完成后，能够根据需求的增加改动等对系统进行升级修改，有足够的拓展性。

2.3 安全性

客户的个人信息等数据存储传输时能够保障安全性，避免泄露。

2.4 可测试性

能够对每个功能模块进行功能测试，能直接观察测试结果。

**3 用例图**

![](media/image1.png){width="5.764583333333333in" height="4.780555555555556in"}

![](media/image2.png){width="4.875in" height="5.760416666666667in"}

![](media/image3.png){width="5.104166666666667in" height="1.832638888888889in"}
