package dp15_observerPattern.ch1;

//target
public class Button {	
	
	//update
	public void onClick(){
		//�̺�Ʈ ó��
		if (onClickListener!=null) {
			onClickListener.onClick(this);
		}
	}
	
	//Observer
	public interface OnClickListener{
		public void onClick(Button button);
	}
	
	private OnClickListener onClickListener;
	
	//setObserver
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
}
