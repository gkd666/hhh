import java.util.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class addressbook {
	public static Collection<String> damagedAddressBook = new ArrayList<String>();//���ڴ洢ÿһ��ԭʼ��ַ��Ϣ
	public static void main(String[] args)throws IOException {
	     
		while(true)
	{ 		String inputpath=args[0];
	      String outputpath=args[1];//��ȡ��������ļ�����
	      FileInputStream fis = new FileInputStream(inputpath);
          InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
          @SuppressWarnings("resource")
  		BufferedReader br = new BufferedReader(isr);
          String line = null;
          while ((line = br.readLine()) != null) {
              damagedAddressBook.add(line);
          }
          FileOutputStream fos = new FileOutputStream(outputpath);
          @SuppressWarnings("resource")
  		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
          Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		
		
		String name,phone,p1,add1="",add2="",add3="",add4="",add5="",add6="",add7="";
		int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,l=0;
		
		String[]s1=s.split("\\d{11}");
		p1=s.replace(s1[0],"");
		phone=p1.replace(s1[1],"");
	
		
		s=s1[0]+s1[1];
		int size=s.length();
		
		int n1=s.indexOf(",");
		name=s.substring(2,n1);
		
		
		String sheng[]= {
				"����",
				"���",
				"�Ϻ�",
				"����",
				"�½�",
				"����",
				"����",
				"����",
				"����",
				"�ӱ�",
				"����",
				"����",
				"����",
				"������",
				"����",
				"����",
				"ɽ��",				
				"����",
				"�㽭",
				"����",
				"����",				
				"����",
				"ɽ��",				
				"����",
				"����",
				"����",
				"����",
				"�㶫",
				"�ຣ",				
				"�Ĵ�",				
				"����",
				"̨��"};
		
		String city[]= {
			     "����","������","����","����","����","��ɽ","��˳","����","����","B","����","����",

		            "����","����","��ɽ","��ͷ","����","����","����","��Ϫ","�Ͻ�","����","��ɫ","����",

		            "����","�ɶ�","��ɳ","����","����","����","����","����","����","����","����","�е�",

		            "����","���","����","����","����","����","����","����","��ݸ","����","����","����",

		            "��ͬ","���˰���","�º�","����","����","����","����","��Ӫ","������˹","��ʩ","����",

		            "����","���Ǹ�","��ɽ","��˳","����","����","����","����","����","����","����",

		            "����","����","�㰲","��Ԫ","���","����","����","������","�Ϸ�","����","���ͺ���",

		            "����","����","����","����","����","����","�ױ�","�ӳ�","�׸�","�ں�","��ˮ","����",

		            "��Դ","����","���","����","����","����","����","�Ƹ�","����","��ɽ","��ʯ","����",

		            "��«��","���ױ���","����","����","����","��ľ˹","����","����","����","����","������",

		            "����","����","���","����","������","����","����","��","����","����","����","�Ž�",

		            "��Ȫ","����","����","����","����","����","����","�ȷ�","��ɽ","��ɽ","���Ƹ�",

		            "�ĳ�","����","��Դ","����","�ٲ�","�ٷ�","����","����","��֥","��ˮ","����","����ˮ",

		            "����","¤��","����","¦��","���","����","����","����","��ɽ","ï��","üɽ","÷��",

		            "����","ĵ����","�Ͼ�","�ϲ�","����","����","�ϳ�","��ƽ","��ͨ","����","����","�ڽ�",

		            "����","ŭ��","�̽�","��֦��","ƽ��ɽ","ƽ��","Ƽ��","����","���","�ൺ","ǭ����",

		            "ǭ��","ǭ����","����","��Զ","�ػʵ�","����","�������","Ȫ��","����","����","�տ���",

		            "����","�Ϻ�","����","����","����","ʯ��ׯ","����Ͽ","����","����","����","����","����",

		            "ɽ��","��ͷ","��β","�ع�","����","����","ʮ��","˷��","��ƽ","�绯","����","����","��Ǩ",

		            "����","���","̫ԭ","̩��","̩��","̨��","��ɽ","��ˮ","����","ͭ��","ͨ��","ͨ��",

		            "ͭ��","ͭ��","̨��","�人","��³ľ��","����","����","Ϋ��","��ɽ","����","�ں�","�ߺ�",

		            "�����첼","����","����","����","����","����","�差","��̶","����","����","����","Т��",

		            "��̨","����","����","����","����","��˫����","����","���","����","���","���ֹ���","�˰�",

		            "����","�Ű�","�Ӱ�","�ӱ�","�γ�","����","��Ȫ","����","��̨","�˱�","�˲�","�˴�",

		            "Ӫ��","����","����","����","����","�˳�","�Ƹ�","����","��Ϫ","����",

		            "��ׯ","��������",

		            "��³����","�żҸ�","�żҽ�","�żҿ�",

		            "��Ҵ","����","տ��",

		            "����","��ͨ",

		            "֣��","����","��",

		            "��ɽ",

		            "����","��ɽ",

		            "�麣","פ���","׼�����","׿��",

		            "����","�Ͳ�","�Թ�",

		            "����"

					};
		int i;
		for(i=0;i<32;i++)
		{	
			n1=s.indexOf(sheng[i]);
			if(n1!=-1&&(i==0||i==1||i==2||i==3))
			{	l=1;
				add1=s.substring(n1,n1+2);
				add2=add1+"��";		
				break;
			}
			else if(n1!=-1&&i==4)
			{
				add1=s.substring(n1,n1+2);
				add1=add1+"ά���������";	
				break;
			}
			else if(n1!=-1&&i==5)
			{
				add1=s.substring(n1,n1+2);
				add1=add1+"����������";		
				break;
			}
			else if(n1!=-1&&i==6)
			{
				add1=s.substring(n1,n1+2);
				add1=add1+"׳��������";		
				break;
			}
			else if(n1!=-1&&i==7)
			{
				add1=s.substring(n1,n1+2);
				add1=add1+"��������";		
				break;
			}
			else if(n1!=-1&&i==8)
			{
				add1=s.substring(n1,n1+2);
				add1=add1+"������";		
				break;
			}
			else if(n1!=-1&&i!=8)
			{
				add1=s.substring(n1,n1+2);
				add1=add1+"ʡ";		
				break;
			}
			else if(n1!=-1&&i==8)
			{
				add1=s.substring(n1,n1+3);
				add1=add1+"ʡ";		
				break;
			}
			
		}
		//
		int n;
		for(i=0;i<city.length;i++)
		{			
			n1=s.indexOf(city[i]);
			if(n1!=-1)
			{
				n=s.indexOf("��");
				if(n!=-1)
				{add2=s.substring(n1,n+1);
				 f2=n+1;
				 break;
				}
				else
				{add2=s.substring(n1,n1+2);
				 add2=add2+"��"; 
				 f2=n1+2;					
				 break;
				}
			}
				
		}
		//
		n1=s.indexOf("��");
		if(n1!=-1)
		{ 
			add3=s.substring(f2,n1+1);
			f3=n1+1;
		}
		else
		{	n1=s.indexOf("��");
			if(n1!=-1)
			{add3=s.substring(n1-2,n1+1);
			f3=n1+1;
			}
			else
			f3=f2;
		}
		//
		n1=s.indexOf("�ֵ�");
		if(n1!=-1)
		{
			add4=s.substring(f3,n1+2);
			f4=n1+2;
		}
		else
		{	n1=s.indexOf("��");
			if(n1!=-1)
			{
				add4=s.substring(f3,n1+1);
				f4=n1+1;
			}
			else
			{	n1=s.indexOf("��");
				if(n1!=-1)
				{
				add4=s.substring(f3,n1+1);
				f4=n1+1;
				}
				else
				f4=f3;
			}
		}
		//
		//
		
		
        int	f;
		f=s.indexOf("1");
		if(f!=0)
		{
		n1=s.indexOf("·");
		add5=s.substring(f4,n1+1);
		f5=n1+1;
		//
		n1=s.indexOf("��");
		add6=s.substring(f5,n1+1);
		f6=n1+1;
		//
		add7=s.substring(f6,size-1);
		//
		   osw.write("{");
		   osw.flush();
		   osw.write("\"����\":"+"\""+name+"\""+",");
		   osw.flush();
		   osw.write("\"�ֻ�\":"+"\""+phone+"\""+",");
		   osw.flush();
		   osw.write("\"��ַ\":"+"[" );
		   osw.flush();
		   osw.write("\""+add1+"\""+",");
		   osw.flush();
		   osw.write("\""+add2+"\""+",");
		   osw.flush();
		   osw.write("\""+add3+"\""+",");
		   osw.flush();
		   osw.write("\""+add4+"\""+",");
		   osw.flush();
		   osw.write("\""+add5+"\""+",");
		   osw.flush();
		   osw.write("\""+add6+"\""+",");
		   osw.flush();
		   osw.write("\""+add7+"\"");
		   osw.flush();
		   osw.write("]");
		   osw.flush();
		   osw.write("}"+",");
		   osw.flush();
	    }
		else
		{	
			add5=s.substring(f4,size-1);
			osw.write("{");
			osw.flush();
			osw.write("\"����\":"+"\""+name+"\""+",");
			osw.flush();
			osw.write("\"�ֻ�\":"+"\""+phone+"\""+",");
			osw.flush();
			osw.write("\"��ַ\":"+"[" );
			osw.flush();
			osw.write("\""+add1+"\""+",");
			osw.flush();
			osw.write("\""+add2+"\""+",");
			osw.flush();
			osw.write("\""+add3+"\""+",");
			osw.flush();
			osw.write("\""+add4+"\""+",");
			osw.flush();
			osw.write("\""+add5+"\"");
			osw.flush();
			osw.write("]");
			osw.flush();
			osw.write("}"+",");
			osw.flush();
		
		}
	}
	}
		
}
