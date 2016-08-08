package com.kong.swipedelete;

public class SwipeLayoutManager {
	private SwipeLayoutManager(){}
	private static SwipeLayoutManager mInstance = new SwipeLayoutManager();
	
	public static SwipeLayoutManager getInstance(){
		return mInstance;
	}
	
	private SwipeLayout currentLayout;
	public void setSwipeLayout(SwipeLayout layout){
		this.currentLayout = layout;
	}
	
	/**
	 * 清空当前所记录的已经打开的layout
	 */
	public void clearCurrentLayout(){
		currentLayout = null;
	}
	
	/**
	 * 关闭当前已经打开的SwipeLayout
	 */
	public void closeCurrentLayout(){
		if(currentLayout!=null){
			currentLayout.close();
		}
	}
	
	/**
	 * 判断当前是否应该能够滑动，如果没有打开的，则可以滑动。
	 * 
	 * @return
	 */
	public boolean isShouldSwipe(SwipeLayout swipeLayout){
		if(currentLayout==null){
			return true;
		}else {
			return currentLayout==swipeLayout;
		}
	}
}
