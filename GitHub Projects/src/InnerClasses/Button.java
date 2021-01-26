 package InnerClasses;

public class Button {

	// interface
	public interface OnClickLister {
		public void onClick(String title);
	}		
	
	private String title;
	private OnClickLister onClickListner;
	
	// get
	public String getTitle() {
		return title;
	}
	
	public Button(String title) {
		this.title = title;
	}
	
	public void setOnClickListner(OnClickLister onClickListner) {
		this.onClickListner = onClickListner;
	}

	public void onClick() {
		this.onClickListner.onClick(this.title);
	}
	
}
