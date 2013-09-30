package com.github.gwtd3.api.layout;

import com.github.gwtd3.api.Sort;
import com.github.gwtd3.api.arrays.Array;
import com.github.gwtd3.api.functions.DatumFunction;

/**
 * @author Amado Fakhry (created at Sep 26, 2013)
 * 
 */
public class TreemapLayout extends Layout<TreemapLayout> {

	public static enum TreemapMode {

		SQUARIFY("squarify "), SLICE("slice"), DICE("dice"), SLICE_DICE("slice-dice");

		private final String	value;

		private TreemapMode(final String value) {
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		public static TreemapMode fromValue(final String value) {
			return valueOf(value.toUpperCase().replace('-', '_'));
		}
	}

	protected TreemapLayout() {
		super();
	}

	public final native Array<Node> nodes(Node r) /*-{
		return this.nodes(r);
	}-*/;

	public final native Array<Link> links(Array<Node> n) /*-{
		return this.links(n);
	}-*/;

	public final native TreemapLayout size(double width, double height) /*-{
		return this.size([ width, height ]);
	}-*/;

	public final native Array<Double> size() /*-{
		return this.size();
	}-*/;

	public final native TreemapLayout sort(Sort sort) /*-{
		return this.sort(sort);
	}-*/;

	public final native TreemapLayout children(DatumFunction<Array<Node>> df) /*-{
		return this
				.children(function(d) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},0);
				});
	}-*/;

	public final native TreemapLayout value(DatumFunction<?> df) /*-{
		return this
				.value(function(d, i) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native DatumFunction<?> value() /*-{
		return this.value();
	}-*/;

	public final native TreemapLayout round(boolean round) /*-{
		return this.round(round);
	}-*/;

	public final native TreemapLayout round(DatumFunction<Boolean> df) /*-{
		return this
				.round(function(d, i) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native boolean round() /*-{
		return this.round();
	}-*/;

	public final native TreemapLayout padding(double padding) /*-{
		return this.padding(padding);
	}-*/;

	public final native TreemapLayout padding(DatumFunction<Double> df) /*-{
		return this
				.padding(function(d, i) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native double padding() /*-{
		return this.padding();
	}-*/;

	public final native TreemapLayout sticky(boolean sticky) /*-{
		return this.sticky(sticky);
	}-*/;

	public final native TreemapLayout sticky(DatumFunction<Boolean> df) /*-{
		return this
				.sticky(function(d, i) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native boolean sticky() /*-{
		return this.sticky();
	}-*/;

	public final native TreemapLayout ratio(double ratio) /*-{
		return this.ratio(round);
	}-*/;

	public final native TreemapLayout ratio(DatumFunction<Double> df) /*-{
		return this
				.ratio(function(d, i) {
					return df.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native double ratio() /*-{
		return this.ratio();
	}-*/;

	public final native TreemapMode mode() /*-{
		return @com.github.gwtd3.api.layout.StackLayout.OffsetMode::fromValue(Ljava/lang/String;)(this.offset());
	}-*/;

	public final native TreemapLayout mode(final TreemapMode i) /*-{
		return this
				.offset(i.@com.github.gwtd3.api.layout.StackLayout.OffsetMode::getValue()());
	}-*/;

}
