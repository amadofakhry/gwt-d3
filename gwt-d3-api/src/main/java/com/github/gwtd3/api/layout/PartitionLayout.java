package com.github.gwtd3.api.layout;

import com.github.gwtd3.api.Sort;
import com.github.gwtd3.api.arrays.Array;
import com.github.gwtd3.api.functions.DatumFunction;

/**
 * @author Amado Fakhry (created at Oct 1, 2013)
 * 
 */
public class PartitionLayout extends Layout<PartitionLayout> {

	protected PartitionLayout() {
		super();
	}

	public final native Array<Node> nodes(Node r) /*-{
		return this.nodes(r);
	}-*/;

	public final native Array<Link> links(Array<Node> n) /*-{
		return this.links(n);
	}-*/;

	public final native PartitionLayout sort(Sort sort) /*-{
		return this.sort(sort);
	}-*/;

	public final native TreemapLayout size(double width, double height) /*-{
		return this.size([ width, height ]);
	}-*/;

	public final native Array<Double> size() /*-{
		return this.size();
	}-*/;

	public final native PartitionLayout children(DatumFunction<Array<Node>> df) /*-{
		return this
				.children(function(d) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},0);
				});
	}-*/;

	public final native PartitionLayout value(DatumFunction<?> df) /*-{
		return this
				.value(function(d, i) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native DatumFunction<?> value() /*-{
		return this.value();
	}-*/;

}
