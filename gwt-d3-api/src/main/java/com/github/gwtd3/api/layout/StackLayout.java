/**
 * Copyright (c) 2013, Anthony Schiochet and Eric Citaire
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * The names Anthony Schiochet and Eric Citaire may not be used to endorse or promote products
 *   derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL MICHAEL BOSTOCK BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
 * OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.github.gwtd3.api.layout;

import java.util.List;

import com.github.gwtd3.api.arrays.Array;
import com.github.gwtd3.api.functions.DatumFunction;
import com.google.gwt.core.client.JavaScriptObject;

public class StackLayout extends Layout<StackLayout> {

	protected StackLayout() {
		super();
	}

	public static enum OffsetMode {

		SILHOUETTE("silhouette"), WIGGLE("wiggle"), ZERO("zero");

		private final String	value;

		private OffsetMode(final String value) {
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		public static OffsetMode fromValue(final String value) {
			return valueOf(value.toUpperCase().replace('-', '_'));
		}
	}

	public final native StackLayout x(final DatumFunction<Double> callback)/*-{
		return this
				.x(function(d, i) {
					return callback.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native StackLayout x(double d) /*-{
		return this.x(d);
	}-*/;

	public final native StackLayout y(final DatumFunction<Double> callback) /*-{
		return this
				.y(function(d, i) {
					return callback.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native StackLayout y(double d) /*-{
		return this.y(d);
	}-*/;

	public final native StackLayout order(String order) /*-{
		return this.order(order);
	}-*/;

	public final native StackLayout order(final DatumFunction<?> callback)/*-{
		return this
				.order(function(d, i) {
					return callback.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

	public final native OffsetMode offset() /*-{
    	return @com.github.gwtd3.api.layout.StackLayout.OffsetMode::fromValue(Ljava/lang/String;)(this.offset());
	}-*/;

	public final native StackLayout offset(final OffsetMode i) /*-{
		return this
				.offset(i.@com.github.gwtd3.api.layout.StackLayout.OffsetMode::getValue()());
	}-*/;

	// ========== Values =========

	public final native Array<?> values()/*-{
		return this.values();
	}-*/;

	public final native StackLayout values(final JavaScriptObject values)/*-{
		return this.values(values);
	}-*/;

	public final StackLayout values(double... values) {
		return this.values(Array.fromDoubles(values));
	}

	public final StackLayout values(String... values) {
		return this.values(Array.fromObjects(values));
	}

	public final StackLayout values(final List<?> values) {
		return this.values(Array.fromJavaArray(values.toArray()));
	}

	public final native StackLayout values(final DatumFunction<?> callback)/*-{
		return this
				.values(function(d, i) {
					return callback.@com.github.gwtd3.api.functions.DatumFunction::apply(Lcom/google/gwt/dom/client/Element;Lcom/github/gwtd3/api/core/Value;I)(this,{datum:d},i);
				});
	}-*/;

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

}
