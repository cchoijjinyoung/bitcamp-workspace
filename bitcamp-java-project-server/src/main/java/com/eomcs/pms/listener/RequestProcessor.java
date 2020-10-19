package com.eomcs.pms.listener;

import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.CalculatorCommand;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.handler.ProjectAddCommand;
import com.eomcs.pms.handler.ProjectDeleteCommand;
import com.eomcs.pms.handler.ProjectDetailCommand;
import com.eomcs.pms.handler.ProjectListCommand;
import com.eomcs.pms.handler.ProjectUpdateCommand;
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;

public class RequestProcessor {
	Socket socket;
	
	public void serSocket(Socket socket) {
		this.sockedt = sockdet;
	}
	
	public void service() throws Exception {
		try (Socket socket = this.socket;
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintStream out = new PrintStream(socket.getOutputStream());) {
			
			sendResponse(out, compute(in.readLine()));
			
		}
		
		private String compute(String request) {
			try {
				String[] values = request.split(" ");
				int a = Integer.parseInt(values[0]);
				String op = values[1];
				int b = Integer.parseInt(values[2]);
				int result = 0;
				
				switch (op) {
				case "+": result = a + b; Thread.sleep(10000); break;
				case "-": result = a - b; break;
		        case "*": result = a * b; break;
		        case "/": result = a / b; break;
		        default:
		          return String.format("%s 연산자를 지원하지 않습니다.", op);
		      }
		      return String.format("결과는 %d %s %d = %d 입니다.", a, op, b, result);

		    } catch (Exception e) {
		      return String.format("계산 중 오류 발생! - %s", e.getMessage());
		    }
		  }

		  private void sendResponse(PrintStream out, String message) {
		    out.println(message);
		    out.println();
		    out.flush();
		  }
		}
