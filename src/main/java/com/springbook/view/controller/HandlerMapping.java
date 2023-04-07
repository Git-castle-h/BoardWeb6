package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.controller.board.*;
import com.springbook.view.user.Login;
import com.springbook.view.user.LoginController;
import com.springbook.view.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;

	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/logout.do", new LogoutController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/getBoard", new GetBoard());
		mappings.put("/getBoardList", new GetBoardList());
		mappings.put("/insertBoard", new InsertBoard());
		mappings.put("/login", new Login());
		mappings.put("/", new Login());

	}

	public Controller getController(String path) {
		return mappings.get(path);
	}
}
