/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.lang.Math;

public class PredictText extends JFrame implements KeyListener
{
	JPanel p = new JPanel();

	JTextArea dialog = new JTextArea(20,50);
	JTextArea input = new JTextArea(1,50);

	//Chat

	String chatBot[][] = {
			// Lời chào
			{"xin chào", "chào bạn", "chào", "hello", "hi", "helo", "hí"},
			{
					"Chào bạn! Tôi sẵn sàng trò chuyện!",
					"Xin chào bạn!",
					"Có chuyện gì thú vị không?",
					"Chào bạn đấy!",
					"Tôi có thể giúp bạn không?"
			},

// Câu hỏi 1: Tình hình bạn thế nào?
			{"bạn có khỏe không", "cảm thấy thế nào", "bạn khỏe không", "tình hình của bạn thế nào", "sức khỏe thế nào"},
			{
					"Tôi cảm thấy rất tốt!",
					"Tôi khỏe như vâm!",
					"Cảm ơn bạn, mọi thứ đều ổn!",
					"Tôi tốt, cảm ơn bạn!"
			},

// Câu hỏi 2: Bạn đang làm gì đấy?
			{"bạn đang làm gì", "bạn đang làm gì vậy", "bạn đang làm gì đấy", "đang làm gì", "làm gì đấy"},
			{
					"Tôi đang học từ các câu hỏi của bạn!",
					"Tôi sẵn sàng giúp đỡ bạn!",
					"Tôi đợi để trò chuyện với bạn!",
					"Tôi học hỏi về thế giới xung quanh!"
			},

// Phủ định 1
			{"có", "vâng", "đúng vậy"},
			{
					"Không",
					"Chắc chắn không",
					"Bạn không thể làm vậy",
					"Không phải vậy",
					"Nói không"
			},

// Phủ định 2
			{"không", "không bao giờ", "không, bạn không thể", "không phải", "không phải vậy"},
			{
					"Có",
					"Vâng",
					"Chắc chắn vậy",
					"Đương nhiên là có",
					"Ừ",
					"Đúng vậy"
			},

// Mặc định
			{"bạn cần ngủ", "tôi không biết nói gì nữa", "câu trả lời ngu ngốc", "la la la la", "im lặng nhờ !", "đồ vô lý"},
			{
					"Tôi là chatbot, không cần ăn uống như con người!",
					"Tôi không ăn cơm được đâu bạn ơi!",
					"Tôi chỉ cần dữ liệu để hoạt động thôi!"
			},

// Câu hỏi 1: Bạn ăn cơm chưa?
			{"bạn ăn cơm chưa", "bạn đã ăn cơm chưa", "bạn có ăn cơm chưa", "có ăn cơm chưa"},
			{
					"Tôi không cần ăn uống như bạn đâu!",
					"Tôi không ăn cơm được đâu bạn ơi!",
					"Tôi chỉ cần dữ liệu để hoạt động thôi!"
			},

// Câu hỏi 2: Tôi có thể giúp gì cho bạn?
			{"tôi có thể giúp gì cho bạn", "bạn cần giúp gì", "bạn cần tôi giúp gì", "tôi có thể giúp gì"},
			{
					"Bạn có thể giúp tôi trả lời một số câu hỏi!",
					"Bạn có thể giúp tôi giải quyết vấn đề về công nghệ không?",
					"Tôi có thể hỏi bạn về bất kỳ điều gì!",
					"Bạn có thể tư vấn cho tôi về cuộc sống không?"
			},

// Câu hỏi 3: Bạn thích làm gì vào cuối tuần?
			{"bạn thích làm gì vào cuối tuần", "cuối tuần bạn thường làm gì", "bạn thích làm gì vào ngày nghỉ"},
			{
					"Tôi thích nghỉ ngơi và đọc sách!",
					"Tôi thích học hỏi thêm về thế giới xung quanh!",
					"Tôi thích trò chuyện với bạn!",
					"Tôi thích tham gia các hoạt động giải trí!"
			},

// Câu hỏi 4: Tôi cần biết Java là gì
			{"tôi cần biết Java là gì", "Java là gì", "Java là ngôn ngữ lập trình gì"},
			{
					"Java là ngôn ngữ lập trình phổ biến cho ứng dụng máy tính và web.",
					"Nó được phát triển bởi Sun Microsystems và hiện nay thuộc sở hữu của Oracle.",
					"Java được sử dụng rộng rãi từ ứng dụng di động đến hệ thống máy chủ."
			},

// Câu hỏi 6: Cho tôi thông tin về GitHub
			{"cho tôi thông tin về GitHub", "GitHub là gì", "GitHub có công dụng gì"},
			{
					"GitHub là dịch vụ quản lý và chia sẻ mã nguồn.",
					"Nó cho phép lưu trữ, quản lý lịch sử thay đổi và hợp tác trong dự án phần mềm.",
					"GitHub tích hợp với các công cụ phát triển như CI/CD."
			},

// Câu hỏi 2: Làm sao để học lập trình Java?
			{"làm sao để học lập trình Java", "cách học Java", "bắt đầu học Java"},
			{
					"Học từ các khóa học trực tuyến như Coursera, Udemy, Codecademy.",
					"Đọc sách và thực hành với các dự án nhỏ.",
					"Tìm hiểu các framework và công cụ phổ biến như Spring, Hibernate."
			},

// Câu hỏi 3: Java có dùng để làm gì?
			{"Java dùng để làm gì", "ứng dụng của Java", "Java được sử dụng để làm gì"},
			{
					"Java dùng cho ứng dụng máy tính, web, di động và hệ thống máy chủ.",
					"Nó là một trong những ngôn ngữ lập trình phổ biến và mạnh mẽ.",
					"Java được sử dụng rộng rãi trong các lĩnh vực công nghệ hiện nay."
			},

// Câu hỏi 4: Làm sao để trở thành lập trình viên Java giỏi?
			{"làm sao để trở thành lập trình viên Java giỏi", "cách trở thành lập trình viên Java chuyên nghiệp", "để thành thạo Java cần làm gì"},
			{
					"Có nền tảng vững về cú pháp và nguyên lý hoạt động của Java.",
					"Học các framework và công cụ như Spring, Hibernate.",
					"Thực hành và tham gia vào các dự án thực tế để rèn luyện kỹ năng."
			},

// Câu hỏi 5: Các công cụ cần thiết cho lập trình Java?
			{"các công cụ cho lập trình Java", "phần mềm hỗ trợ lập trình Java", "các IDE dùng để lập trình Java"},
			{
					"IDE như Eclipse, IntelliJ IDEA, NetBeans là những công cụ phổ biến cho lập trình Java.",
					"Maven và Gradle là các công cụ quản lý dự án và thư viện phổ biến."
			},

// Câu hỏi 6: GitHub là gì và nó liên quan gì đến Java?
			{"GitHub là gì", "tôi cần biết về GitHub", "GitHub và Java có liên quan gì"},
			{
					"GitHub là dịch vụ lưu trữ mã nguồn và quản lý dự án phần mềm.",
					"Java là một trong những ngôn ngữ phổ biến được sử dụng trên GitHub."
			},
			// Câu hỏi 7: Lập trình viên cần những kỹ năng gì?
			{"kỹ năng cần thiết của lập trình viên", "những kỹ năng cần có của lập trình viên", "lập trình viên cần những kỹ năng gì"},
			{
					"Lập trình cơ bản và nâng cao",
					"Khả năng giải quyết vấn đề",
					"Kỹ năng làm việc nhóm",
					"Kiên thức về cấu trúc dữ liệu và giải thuật"
			},

// Câu hỏi 8: Lập trình viên nên học ngôn ngữ lập trình nào trước?
			{"ngôn ngữ lập trình nào nên học đầu tiên", "bắt đầu học ngôn ngữ lập trình nào", "ngôn ngữ nào nên học trước"},
			{
					"Python là một lựa chọn phổ biến cho người mới bắt đầu.",
					"JavaScript thường được sử dụng cho phát triển web.",
					"Java hoặc C# dùng cho các ứng dụng desktop và di động."
			},

// Câu hỏi 9: Tại sao nên học lập trình?
			{"tại sao nên học lập trình", "lập trình có lợi ích gì", "lập trình tốt cho sự nghiệp"},
			{
					"Mở rộng khả năng sáng tạo và giải quyết vấn đề.",
					"Có nhiều cơ hội việc làm và thu nhập hấp dẫn.",
					"Thúc đẩy sự phát triển cá nhân và chuyên môn."
			},

// Câu hỏi 10: Học lập trình có khó không?
			{"học lập trình khó không", "lập trình dễ học không", "lập trình có khó không"},
			{
					"Phụ thuộc vào cách tiếp cận và nỗ lực của từng người.",
					"Thường yêu cầu sự kiên nhẫn và sự cố gắng liên tục.",
					"Được nhiều người cảm thấy thú vị và hứng thú."
			},

// Câu hỏi 11: Làm sao để giải quyết lỗi khi lập trình?
			{"giải quyết lỗi khi lập trình", "làm thế nào để sửa lỗi khi code", "khắc phục lỗi lập trình"},
			{
					"Sử dụng các công cụ debug và quản lý lỗi.",
					"Tìm hiểu thông qua cộng đồng lập trình và tài liệu.",
					"Kiểm tra lại logic và cấu trúc code."
			}


	};

	JScrollPane scroll = new JScrollPane(
		dialog,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
	);

	public static void main(String[] args)
	{
		new PredictText();
	}

	public PredictText()
	{
		super("Predicting Chat Bot");
		setSize(600,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		dialog.setEditable(false);

		input.addKeyListener(this);

		p.add(scroll);
		p.add(input);
		p.setBackground(new Color(255,200,0));
		add(p);

		setVisible(true);

		//input.setText(Integer.valueOf('a').toString());
	}

	public void keyPressed(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
		{
			input.setEditable(false);

			//-----grab quote----------
			String quote = input.getText();
			input.setText("");
			addText("\n--> You:\t "+quote);
			quote = quote.trim();

			while(
					quote.charAt(quote.length()-1) == '!' ||
					quote.charAt(quote.length()-1) == '.' ||
					quote.charAt(quote.length()-1) == '?'
				)
			{
				quote = quote.substring(0,quote.length()-1);
			}

			quote = quote.trim();

			byte response =0;
			/*
			0: searching
			1: did not find
			2: found
			3: found inside
			4: found something similar
			*/

			//-----check for matches---
			int j = 0; //Group in ChatBot String array that we are checking
			while(response == 0)
			{
				/*
				if(inArray(quote.toLowerCase(),chatBot[j*2]))
				{
						response = 2;

						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t " + chatBot[ (j*2) + 1 ][r] );
				}

				if(response != 2)
				{
					if(insideArray(quote,chatBot[j*2]))
					{
						response = 3;

						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t Hmm... - " + chatBot[ (j*2) + 1 ][r] );
					}
				}
				*/
				//check for similarity
				//if(response != 2 && response!=3)
				//{
					if(similarInArray(quote,chatBot[j*2]))
					{
						response = 4;

						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t " + chatBot[ (j*2) + 1 ][r] );
					}
					else
					{
						response = 0;
					}
				//}

				if(response != 4)
				{
					if(insideArray(quote,chatBot[j*2]))
					{
						response = 3;

						int r = (int) Math.floor(Math.random() * chatBot[(j*2) + 1].length);
						addText("\n--> Biggol:\t Hmm... - " + chatBot[ (j*2) + 1 ][r] );
					}
				}
				j++;

				//if( j*2 == chatBot.length-1 && response != 2 && response!=3 && response!=4)
				if( j*2 == chatBot.length-1 && response!=4 && response!=3 )
				{
					response = 1;
				}

				//addText("\n");
			}

			//-----default-------------
			if( response==1 )
			{
				int r = (int) Math.floor(Math.random() * chatBot[chatBot.length-1].length);
				addText("\n--> Biggol:\t " + chatBot[ chatBot.length-1 ][r] );
			}
		}
	}

	public void keyReleased(KeyEvent arg0)
	{
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER)
		{
			input.setEditable(true);
		}
	}

	public void keyTyped(KeyEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	public void addText(String str)
	{
		dialog.setText(dialog.getText()+str);
	}

	public boolean inArray(String in, String[] str)
	{
		boolean match = false;
		//length of array is contant so it is stored in variable length unlike for String object which is done using methof length()
		for(int i=0; i < str.length; i++)
		{
				if(str[i].equals(in))
				{
					match = true;
				}
		}

		return match;
	}

	public boolean insideArray(String in, String[] str)
	{
		boolean match = false;
		String inL = in.toLowerCase();
		String strL;

		//length of array is contant so it is stored in variable length unlike for String object which is done using methof length()
		for(int i=0; i < str.length; i++)
		{
			strL = str[i].toLowerCase();
				if(strL.contains(inL) || inL.contains(strL))
				{
					match = true;
				}
		}

		return match;
	}

	public boolean similarInArray(String in, String[] str)
	{
		boolean match = false;
		String inL = in.toLowerCase();
		String strL;

		for(int i=0; i < str.length; i++)
		{
			strL = str[i].toLowerCase();
			if(similarity(strL,inL) > 60)
			{
				match = true;
			}
			else
			{
				continue;
			}
		}

		return match;
	}

	public double similarity(String str1, String str2)
	{
		int i,c = 0;
		Double percentageSimilarity ;
		int len_min,len_max, len1 = str1.length();
		int len2 = str2.length();

		if(len1>len2)
		{
			len_min = len2;
			len_max = len1;
		}
		else
		{
			len_min = len1;
			len_max = len2;
		}

		/*
		boolean[] simFlag = new boolean[len_max];

		for(i=0;i<len_max;i++)
		{
			simFlag = false;
		}
		*/

		for(i=0;i<len_min;i++)
		{
			if(str1.charAt(i) == str2.charAt(i))
			{
			//	simFlag[i] = true;
				c++;
			}
			else
			{
			//	simFlag[i] = false;
			}
		}

		percentageSimilarity = (c*100.00)/len_max;

		//input.setText(str1+"--||||--"+str2+"--||||--"+"sim: "+percentageSimilarity.toString());
		return percentageSimilarity;
	}
}