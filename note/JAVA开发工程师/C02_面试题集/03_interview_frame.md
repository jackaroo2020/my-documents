1��Spring ��ssm����ʲô���ã�
```
Spring�����������
���ã�Bean��������������Bean���������ںͿ�ܼ��ɡ�
������ģ�
    1��IOC/DI(���Ʒ�ת/����ע��) ����dao����ע�뵽service�㣬service�㷴ת��action�㣬Spring��������ΪBeanFactory��
    2��AOP������������
```

2��Spring��Ҫʹ����ʲôģʽ��
```
����ģʽ��ÿ��Bean�Ĵ���ͨ������
����ģʽ��Ĭ�ϵ�ÿ��Bean���������ǵ���
����ģʽ������Aop��ʵ��ͨ������ģʽ
```

3��SpringMvc�Ĺ�������ͼ?      
![springMvc����ͼ](./images/springMVC.jpg)

4��Mybatis�ĺô���
````
��Sql����Java�ж���������
��װ�˵ײ��JDBC��API�ĵ��ã������ܹ���������Զ�ת����JavaBean���󣬼���Java���ݿ��̵��ظ�������
�Լ���дSql��䣬���ӵ���
��������ö����װ������map��װ��,ʹ��@Paramע��
````

5����Mybatis������${} �� #{}������
```
${}�����ַ����滻����${}ֱ���滻�ɱ�����ֵ�������κ�ת����������ȡֵ�Ժ���ȥ����SQL��䡣
#{}��Ԥ���봦��sql�е�#{}�滻�ɣ�����ȫԤ������䣬��Ч�ķ�ֹSql���ע�룬����ȡֵ�Ǳ����SQL�����ȡֵ��
�ܽ᣺һ����#{}�������еĴ���
```

6����ȡ��һ���Զ����ɵ�����ֵ��
```
select last  _insert_id()
```

7��Mybatis����ԭ��      
![Mybatis����ԭ��](./images/mybatis.jpg)
```
ͨ��SqlSessionFactoryBuilder��mybatis-config.xml�����ļ��й�����SqlSessionFactory��
SqlSessionFactory����һ��SqlSession��ͨ��SqlSessionʵ�����Mapper����������Mapperӳ���Sql��䡣
������ݿ��CRUD�����������ύ���ر�SqlSession��
```