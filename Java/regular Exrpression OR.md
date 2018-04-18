regular Exrpression OR
======================

String s = "string1, string2, string3";
System.out.println(s.replaceAll("string(1|2)", "blah"));
has the same output. but if you just do this:

String s = "string1, string2, string3";
System.out.println(s.replaceAll("string1|2", "blah"));