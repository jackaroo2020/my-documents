##### �ײⱾ�ص���ͬʱ����gitee��github�˺�,ʵ��ssh������ȡ���ύ�������ã�

**����**                
������������githup ssh���������gitee֧��ssh��ȡԴ�룿

**˼·**      
ssh ��ʽ���ӵ� Github��GitLab����ҪΨһ�Ĺ�Կ�������ͬһ̨���԰�����Github/GitLab �ʺţ���Ҫ��������:        
1.�ܹ��������� ˽Կ/��Կ     
2.push ʱ���������������˻������͵���Ӧ�Ĳֿ�     

**�������**        
1.���� ˽Կ/��Կ ʱ����Կ�ļ����������ظ�        
2.���ò�ͬ Host ��Ӧͬһ HostName ����Կ��ͬ        
3.ȡ�� git ȫ���û���/�������ã�Ϊÿ���ֿ�������� �û���/����       


**�������**         
1.�鿴����githup����
```
ls ~/.ssh
```
      
2.�����¹�Կ
```
ssh-keygen -t rsa -f ~/.ssh/id_rsa_gitee -C "your email@xx.com"
```   
![�鿴������](images/03_1.png)

3.����id_rsa_gitee.pub�Ĺ�Կ��Զ��ssh���ô���ʡ�ԣ�        
4.����config�ļ����� .ssh �ļ������½� **config**�ļ����༭��ʹ��ͬ Host ʵ��ӳ�䵽ͬһHostName������Կ�ļ���ͬ��
```
# default                                                                       
Host github.com
HostName github.com
User songyp
IdentityFile ~/.ssh/id_rsa
# two                                                                           
Host gitee.com
HostName gitee.com
User git
IdentityFile ~/.ssh/id_rsa_gitee
```
5.���� ssh ����    
```
ssh -T git@gitlab.com
ssh -T git@github.com
# Hi XXX! You've successfully authenticated, but GitHub does not provide shell access.
# �����ϱ���䣬��ʾ���ӳɹ�
``` 
![result](images/03_test.png

6.ȡ��ȫ�� �û���/�������ã���������Ŀ�ļ��е������á�git config����Ҫ������Ŀ¼��ִ�С�
����ƽʱʹ��githup�Ƚ϶࣬���԰�githup���˻�����Ϊȫ�֣�Ȼ���ڵ�������Ҫ�ñ���˺ŵĹ��������ö�Ӧ���˺š�
�����Ͳ���Ƶ������������á�
```
# ȡ��ȫ�� �û���/���� ����
git config �Cglobal �Cunset user.name
git config �Cglobal �Cunset user.email
# ��������ÿ��repo �û���/����
git config user.email ��xxxx@xx.com��
git config user.name ��xxxx��
```