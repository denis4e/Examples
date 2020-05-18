package core.exceptions.resources;
public class TwoImpl implements Two {
	public void call(AutoCloseableFactory factoryA,AutoCloseableFactory factoryB, TryBody body) throws Throwable {	
		    Exception ex = null;
			try{AutoClosableResource  ResourceA=( AutoClosableResource) factoryA.create();//�������  �
		      try{AutoClosableResource ResourceB=(AutoClosableResource) factoryB.create();//�������  �
			     try{//������� ����
		    	  body.runBody();
		    	  try{//��������� �
		    		 ResourceB.close();
		    	   try{//��������� �
		    		 ResourceA.close();
		    	 }catch(Exception e){//������� ��� �������� �
		    		 ex=e;}
		    	 }catch(Exception e){//������� ��� �������� �
		    		 ex=e;
		    		 try{//��������� � ��� ������� �
			    		 ResourceA.close();
			    	 }		    		 
		    		 catch(Exception supb){//����� � ��� �������� �
                        ex.addSuppressed(supb);
                     }}
		    	 }catch(Exception e){//������� � ����
		    		 ex=e;
		    		 try{
		    			 ResourceB.close();
		    			 try{
		    				 ResourceA.close();
		    			 }
		    			 catch(Exception suppa){//����� � ��� �������� �
		    				 ex=e;
		    				 ex.addSuppressed(suppa);}
		    		 }
		    		 catch(Exception suppb){//����� � ��� �������� �
		    			 ex=e;
		    			 ex.addSuppressed(suppb);
		 				try{//��������� �
		 					ResourceA.close();
		 				}
		 				catch(Exception sup){
		 					       ex.addSuppressed(sup);
		 		            }
		 				ex.addSuppressed(suppb);
	                   }
		    	   }
			     }
		      catch (Exception e) {//������� ��� �������� �
		    	 
		    	 try{//��������� �
					ResourceA.close();
				}
				catch(Exception supa){
					e.addSuppressed(supa);
		           }
		    	 ex=e;
				}
			  }
		    catch (Exception e) {//������� ��� �������� �
		    	ex=e;
		    	}
		    finally {
		          if(ex != null){
		              throw ex;
		          }
			     } 
	 
		    }}
		    

