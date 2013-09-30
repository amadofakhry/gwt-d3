package com.github.gwtd3.api.layout;

import java.util.List;

import com.github.gwtd3.api.Sort;
import com.github.gwtd3.api.arrays.Array;
import com.github.gwtd3.api.functions.DatumFunction;
import com.google.gwt.core.client.JavaScriptObject;

public class PieLayout extends Layout<PieLayout> {

	protected PieLayout() {
		super();
	}

	public final native PieLayout setOrInvokeSetter(String propName, double value)/*-{
		if (typeof this[propName] === 'function') {
			return this[propName](value);
		} else {
			this[propName] = value;
			return this;
		}
	}-*/;

	public final native double startAngle()/*-{
		return $wnd.d3.functor(this.startAngle)();
	}-*/;

	public final PieLayout startAngle(final double startAngle) {
		return setOrInvokeSetter("startAngle", startAngle);
	}

	public final native double endAngle()/*-{
		return $wnd.d3.functor(this.endAngle)();
	}-*/;

	public final PieLayout endAngle(final double endAngle) {
		return setOrInvokeSetter("endAngle", endAngle);
	}

	public final native JavaScriptObject generate(final JavaScriptObject data) /*-{
		return this(data);
	}-*/;

	public final JavaScriptObject generate(final List<?> data) {
		return generate(Array.fromJavaArray(data.toArray()));
	}

	public final JavaScriptObject generate(final double... data) {
		return generate(Array.fromDoubles(data));
	}

	public final native JavaScriptObject generate(JavaScriptObject data, int index) /*-{
		return this(data, index);
	}-*/;

	public final native PieLayout value(final double d) /*-{
		return this.value(d);
	}-*/;

	public final native PieLayout value(final DatumFunction<Double> callback) /*-{
		return this
				.value(function(d, i) {
					return callback.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native PieLayout sort(final Sort sort) /*-{
		return this.sort(sort);
	}-*/;

}
