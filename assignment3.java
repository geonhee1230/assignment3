import javax.swing.JOptionPane;
public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urname= "moneymike";
		String pass = "csc200";
		String accountType = "Student";
		
		boolean loop = true;
		
		String[] choices = { "Admin", "Student", "Staff"};
		
		while(loop)
		{
			loop = false;
			String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]); 
			System.out.println(input);
			
				
			String inputUrname = null;
			String inputPass = null;
			
			if(input != null)
			{
				inputUrname = JOptionPane.showInputDialog("Enter User Name");
				
				if(inputUrname != null)
					inputPass = JOptionPane.showInputDialog("Enter Password");
					
			}
			//if(urname.equals(inputUrname) &&(pass.equals(inputPass))
			//switch(choices){
			
		
			if(urname.equals(inputUrname))
				if(pass.equals(inputPass))
				{
					switch(input)
					{
						case "Admin":
							if(accountType.equals("Admin"))
							{
								JOptionPane.showMessageDialog(null, "Hello "+ input + " " + inputUrname);
							}
							else
							{
								loop = true;
								JOptionPane.showMessageDialog(null, "Wrong account type");
							}
							break;
						case "Student":
							if(accountType.equals("Student"))
							{
								JOptionPane.showMessageDialog(null, "Hello "+ input+ " " + inputUrname);
							}
							else
							{
								loop = true;
								JOptionPane.showMessageDialog(null, "Wrong account type");
							}
							break;
							case "Staff":
								if(accountType.equals("Staff"))
								{
									JOptionPane.showMessageDialog(null, "Hello "+ input+ " " + inputUrname);
								}
								else
								{
									loop = true;
									JOptionPane.showMessageDialog(null, "Wrong account type");
								}
								break;
						
					}
					
				}
				else
				{
					if(inputUrname != null)
					{
						loop = true;
						JOptionPane.showMessageDialog(null, "Fail Authentication");
					}
				}
				else 
				{
					if(inputPass != null)
					{	
						loop = true;
						JOptionPane.showMessageDialog(null, "Fail Authentication");
					}
				}
			}
	}
}