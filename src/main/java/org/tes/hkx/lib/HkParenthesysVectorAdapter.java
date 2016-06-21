package org.tes.hkx.lib;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class HkParenthesysVectorAdapter extends XmlAdapter<String, List<String>> {

    @Override
    public List<String> unmarshal(final String string) {
        final List<String> strings = new ArrayList<String>();

        for (final String s : string.split("\n\t\t\t\t")) {
            final String trimmed = s.trim();

            if (trimmed.length() > 0) {
                strings.add(trimmed);
            }
        }

        return strings;
    }

    @Override
    public String marshal(final List<String> strings) {
        final StringBuilder sb = new StringBuilder();

        for (final String string : strings) {
            if (sb.length() > 0) {
                sb.append("\n\t\t\t\t");
            }

            sb.append(string);
        }

        return sb.toString();
    }
}