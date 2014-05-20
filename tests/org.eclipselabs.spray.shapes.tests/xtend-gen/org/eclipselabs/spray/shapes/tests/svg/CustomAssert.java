package org.eclipselabs.spray.shapes.tests.svg;

import org.junit.Assert;

@SuppressWarnings("all")
public class CustomAssert {
  public void assertEquals(final String description, final String expected, final String serialized) {
    final String expectedMod = expected.replaceAll("(\r\n|\r)", "\n");
    final String serializedMod = serialized.replaceAll("(\r\n|\r)", "\n");
    String _trim = expectedMod.trim();
    String _trim_1 = serializedMod.trim();
    Assert.assertEquals(description, _trim, _trim_1);
  }
}
