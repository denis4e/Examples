package ex.resources;
public class TwoImpl implements Two {
	public void call(AutoCloseableFactory factoryA,AutoCloseableFactory factoryB, TryBody body) throws Throwable {	
		    Exception ex = null;
			try{AutoClosableResource  ResourceA=( AutoClosableResource) factoryA.create();//создаем  А
		      try{AutoClosableResource ResourceB=(AutoClosableResource) factoryB.create();//создаем  В
			     try{//создаем тело
		    	  body.runBody();
		    	  try{//закрываем В
		    		 ResourceB.close();
		    	   try{//закрываем А
		    		 ResourceA.close();
		    	 }catch(Exception e){//поломка при закрытии А
		    		 ex=e;}
		    	 }catch(Exception e){//поломка при закрытии В
		    		 ex=e;
		    		 try{//закрываем А при поломке В
			    		 ResourceA.close();
			    	 }		    		 
		    		 catch(Exception supb){//ловим с чем вылетело В
                        ex.addSuppressed(supb);
                     }}
		    	 }catch(Exception e){//поломка в теле
		    		 ex=e;
		    		 try{
		    			 ResourceB.close();
		    			 try{
		    				 ResourceA.close();
		    			 }
		    			 catch(Exception suppa){//ловим с чем вылетело А
		    				 ex=e;
		    				 ex.addSuppressed(suppa);}
		    		 }
		    		 catch(Exception suppb){//ловим с чем вылетело В
		    			 ex=e;
		    			 ex.addSuppressed(suppb);
		 				try{//закрываем А
		 					ResourceA.close();
		 				}
		 				catch(Exception sup){
		 					       ex.addSuppressed(sup);
		 		            }
		 				ex.addSuppressed(suppb);
	                   }
		    	   }
			     }
		      catch (Exception e) {//поломка при создании В
		    	 
		    	 try{//закрываем А
					ResourceA.close();
				}
				catch(Exception supa){
					e.addSuppressed(supa);
		           }
		    	 ex=e;
				}
			  }
		    catch (Exception e) {//поломка при создании А
		    	ex=e;
		    	}
		    finally {
		          if(ex != null){
		              throw ex;
		          }
			     } 
	 
		    }}
		    

