package com.uc.utils.exportor;

import com.uc.web.forms.Column;
import com.uc.web.forms.ColumnBase;

public class ColumnInfo extends ColumnBase implements ExcelColumn {
	private int widthAdjust;

	public boolean hasChildren() {
		return getSubColumns() != null && getSubColumns().size() > 0;
	}

	@Override
	public void setWidthAdjust(int addWidth) {
		if (hasChildren()) {
			int every = addWidth / getSubColumns().size() + 1;
			for (Column column : getSubColumns()) {
				((ColumnInfo) column).setWidthAdjust(every);
			}
		} else {
			widthAdjust = addWidth;
		}
	}

	public int getWidthAdjust() {
		return widthAdjust;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Column:").append("\n").append("\t").append("title=").append(getTitle()).append("\n")
				.append("\t").append("subColumns=").append(getSubColumns().size()).append("\n").append("\t")
				.append("parent=").append(getParent()).append("\n").append("\t").append("colSpan=").append(getColSpan())
				.append("\n").append("\t").append("rowSpan=").append(getRowSpan()).append("\n");
		return builder.toString();
	}

	public ColumnInfo() {
		this("");		
	}

	public ColumnInfo(String title) {
		this(title, 1, 1);
	}

	public ColumnInfo(String title, int colSpan, int rowSpan) {
		super(title, colSpan, rowSpan, true, false);
	}

	@Override
	public int getWidth() {
		int thisWidth = ExcelHelper.getCellWidth(getTitle());
		if (hasChildren()) {
			int subWidth = 0;
			for (Column column : getSubColumns()) {
				subWidth += ((ColumnInfo) column).getWidth();
			}
			if (thisWidth > subWidth) {
				setWidthAdjust(thisWidth - subWidth);
			} else {
				thisWidth= subWidth;
			}
			
		}
		return thisWidth + getWidthAdjust();
	};	
}
