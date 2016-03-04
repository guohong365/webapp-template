package com.uc.utils;


import java.util.ArrayList;
import java.util.List;

public class TreeItem<DataType extends Object> {
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		for(int i=0; i<level; i++){
			builder.append("-");
		}
		builder.append(level).append(" ")
		.append(id).append(" ")
		.append(text).append("\r\n");
		if(children!=null){
			for(TreeItem<DataType> child:children){
				builder.append(child.toString());
			}
		}		
		return builder.toString();
	}
	TreeItem<DataType> root;
	TreeItem<DataType> parent;
	TreeItem<DataType> last;
	String id;
	String parentId;
	String text;
	String tip;
	int level;
	DataType data;
	ArrayList<TreeItem<DataType>> children;
	
	public TreeItem<DataType> getRoot() {
		return root;
	}

	public void setRoot(TreeItem<DataType> root) {
		this.root = root;
	}

	public TreeItem<DataType> getParent() {
		return parent;
	}

	public void setParent(TreeItem<DataType> parent) {
		this.parent = parent;
	}

	public TreeItem<DataType> getLast() {
		return last;
	}

	public void setLast(TreeItem<DataType> last) {
		this.last = last;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level=level;
	}

	public DataType getData() {
		return data;
	}

	public void setData(DataType data) {
		this.data = data;
	}

	public ArrayList<TreeItem<DataType>> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<TreeItem<DataType>> children) {
		this.children = children;
	}

	public TreeItem(DataType data) {
		root=this;
		setData(data);
	}
	 
	
	void changeChildrenRoot(TreeItem<DataType> item, TreeItem<DataType> r){
		if(item.children!=null){
			for (TreeItem<DataType> child:item.children) {
				child.root=r;
				changeChildrenRoot(child, r);				
			}
		}
	}
	public TreeItem<DataType> find(TreeItem<DataType> parent, String id){
		if(parent!=null && parent.id!=null && parent.id.equals(id)){
			return parent;
		}
		if(parent.children!=null){
			for(TreeItem<DataType> item:parent.children){
				if(item.id.equals(id)){
					return item;
				}
				TreeItem<DataType> retItem=find(item, id);
				if(retItem!=null){
					return retItem;
				}
			}
		}
		return null;
	}
	
	public TreeItem<DataType> add(TreeItem<DataType> item){
		if(item==null){
			return null;
		}
		item.root=this.root;
		item.parent=this.parent;
		item.parentId=this.id;
		item.level=this.level + 1;
		this.last=item;		
		changeChildrenRoot(item, this.root);
		if(this.children==null){
			this.children=new ArrayList<>();
		}
		this.children.add(item);
		return item;
	}
	public TreeItem<DataType> add(String id, TreeItem<DataType> item){
		if(item==null){
			return null;
		}
		TreeItem<DataType> parent=find(this, id);
		if(parent!=null){
			parent.add(item);
			return item;
		}
		return null;
	}
	
	public TreeItem<DataType> findChildren(String id){
		return find(this, id);
	}
	public TreeItem<DataType> insert(TreeItem<DataType> item, String afterId){
		if(this.children!=null){
			for (int i = 0; i < this.children.size(); i++) {
				if(this.children.get(i).id.equals(afterId)){
					this.children.add(i+1, item);
				}				
			}			
		}
		this.add(item);
		return item;
	}
	
	public void getSubItemList(TreeItem<DataType> rootItem, List<DataType> list, boolean includeRoot){
		if(rootItem==null){
			return;
		}
		if(rootItem.id!=null && !rootItem.id.isEmpty() && includeRoot){
			list.add(rootItem.data);
		}
		if(rootItem.children!=null){
			for(TreeItem<DataType> item:rootItem.children){
				getSubItemList(item,list, true);
			}
		}
	}
	
	public List<DataType> getSubItemList(String id, boolean includeRoot){
		List<DataType> list=new ArrayList<>();
		TreeItem<DataType> rootItem;
		if(id!=null){
			rootItem=find(this, id);
			if(rootItem==null || rootItem.id==null){ //not found
				return list;
			}
			getSubItemList(rootItem, list, includeRoot);
		}else {
			rootItem=this;
			getSubItemList(rootItem, list, includeRoot);
		}
		return list;		
	}
	
	public void getSubItemIds(TreeItem<DataType> rootItem, List<String> idList, boolean includeRoot){
		if(rootItem==null){
			return;
		}
		if(includeRoot){
			idList.add(rootItem.id);
		}
		for(TreeItem<DataType> item:rootItem.children){
			getSubItemIds(item, idList, true);
		}		
	}
	
	public List<String> getSubItemIds(String id, boolean includeSelf){
		List<String> idList=new ArrayList<>();
		TreeItem<DataType> rootItem;
		if(id!=null){
			rootItem=find(this, id);
			if(rootItem==null || rootItem.id==null)
				return idList;
			getSubItemIds(rootItem, idList, includeSelf);
		} else {
			getSubItemIds(this, idList, includeSelf);			
		}
		return idList;
	}
	
	public List<DataType> getSubItemList(String id, int depth, boolean includeRoot){
		List<DataType> list=new ArrayList<>();
		TreeItem<DataType> item;
		if(id!=null){
			item=find(this, id);
			if(item==null){
				return list;
			}
		}
		else {
			item=this;
		}
		if(depth<0){
			getSubItemList(item, list, includeRoot);
			return list;
		}
		getSubItemList(item, list, depth, 0, includeRoot);
		return list;
	}

	public void getSubItemList(TreeItem<DataType> rootItem, List<DataType> list, int depth, int current, boolean includeRoot) {
		if(current>depth){
			return;
		}
		if(includeRoot){
			list.add(rootItem.getData());
		}
		if(rootItem.children==null)
			return;
		for(TreeItem<DataType> subItem: rootItem.children){
			getSubItemList(subItem, list, depth, current+1, true);			
		}				
	}
	
	public List<DataType> getSubItemListExcludeId(String excludeId){
		List<DataType> list=new ArrayList<>();
		getSublistItemListExcludeId(this, list, excludeId);
		return list;
	}
	private void getSublistItemListExcludeId(TreeItem<DataType> rootItem, List<DataType> list, String excludeId){
		if(excludeId==null||excludeId.isEmpty()){ //退化为全选
			getSubItemList(rootItem, list, true);
			return;
		}
		
		if(rootItem.id!=null){
			if(rootItem.id.equals(excludeId)){ //是排出ID, 略过
				return;
			}
			list.add(rootItem.data);
		}
		if(rootItem.children!=null){
			for(TreeItem<DataType> item:rootItem.children){
				getSublistItemListExcludeId(item, list, excludeId);
			}
		}
	}
}
