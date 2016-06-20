package board.dto;

public class TB_BoardDTO {
	private String board_No;
	private String mem_Id;
	private String title;
	private String text;
	private int count;
	private String del_Flg;
	private String reg_Dtm;
	private String mod_Dtm;
	
	
	public TB_BoardDTO() {
	}


	public TB_BoardDTO(String board_No, String mem_Id, String title, String text, int count, String del_Flg,
			String reg_Dtm, String mod_Dtm) {
		super();
		this.board_No = board_No;
		this.mem_Id = mem_Id;
		this.title = title;
		this.text = text;
		this.count = count;
		this.del_Flg = del_Flg;
		this.reg_Dtm = reg_Dtm;
		this.mod_Dtm = mod_Dtm;
	}


	public String getBoard_No() {
		return board_No;
	}


	public void setBoard_No(String board_No) {
		this.board_No = board_No;
	}


	public String getMem_Id() {
		return mem_Id;
	}


	public void setMem_Id(String mem_Id) {
		this.mem_Id = mem_Id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getDel_Flg() {
		return del_Flg;
	}


	public void setDel_Flg(String del_Flg) {
		this.del_Flg = del_Flg;
	}


	public String getReg_Dtm() {
		return reg_Dtm;
	}


	public void setReg_Dtm(String reg_Dtm) {
		this.reg_Dtm = reg_Dtm;
	}


	public String getMod_Dtm() {
		return mod_Dtm;
	}


	public void setMod_Dtm(String mod_Dtm) {
		this.mod_Dtm = mod_Dtm;
	}
	
	
	
	
}


