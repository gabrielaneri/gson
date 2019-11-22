/*
 * Copyright (C) 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.internal;

import java.math.BigDecimal;

import junit.framework.TestCase;

public class LazilyParsedNumberTest extends TestCase {
  public void testHashCode() {
    LazilyParsedNumber n1 = new LazilyParsedNumber("1");
    LazilyParsedNumber n1Another = new LazilyParsedNumber("1");
    assertEquals(n1.hashCode(), n1Another.hashCode());
  }

  public void testEquals() {
    LazilyParsedNumber n1 = new LazilyParsedNumber("1");
    LazilyParsedNumber n1Another = new LazilyParsedNumber("1");
    assertTrue(n1.equals(n1Another));
  }
  
  public void testInstanceEquals() {
	  LazilyParsedNumber n1 = new LazilyParsedNumber("1");
	  assertTrue(n1.equals(n1));
  }
  
  public void testInstanceNotEquals() {
	  LazilyParsedNumber n1 = new LazilyParsedNumber("1");
	  LazilyParsedNumber n1Another = new LazilyParsedNumber("2");
	  assertFalse(n1.equals(n1Another));
  }
  
  public void testIntLongValue() {
	LazilyParsedNumber n1 = new LazilyParsedNumber("2147483648");
	int n1Another = -2147483648;
	assertEquals(n1.intValue(), n1Another);
  }
  
  public void testIntBigDecimalValue() {
	LazilyParsedNumber n1 = new LazilyParsedNumber("9223372036854775808");
	int n1Another = 0;
	assertEquals(n1.intValue(), n1Another);
  }
  
  public void testDoubleValue() {
	LazilyParsedNumber n1 = new LazilyParsedNumber("1.5");
	double n1Another = 1.5;
	assertEquals(n1.doubleValue(), n1Another);
  }
  
  public void testFloatValue() {
	LazilyParsedNumber n1 = new LazilyParsedNumber("1.5");
	float n1Another = (float) 1.5;
	assertEquals(n1.floatValue(), n1Another);
  }
}
