package edu.mit.mobile.android.content.column;
/*
 * Copyright (C) 2011-2013 MIT Mobile Experience Lab
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, visit
 * http://www.gnu.org/licenses/lgpl.html
 */

import android.database.Cursor;

/**
 * A string-based timestamp.
 *
 * @author steve
 *
 */
public class TimestampColumn extends DBColumnType<String> {

    public final static String CURRENT_TIMESTAMP = DEFAULT_VALUE_ESCAPE + "CURRENT_TIMESTAMP";
    public final static String CURRENT_DATE = DEFAULT_VALUE_ESCAPE + "CURRENT_DATE";
    public final static String CURRENT_TIME = DEFAULT_VALUE_ESCAPE + "CURRENT_TIME";

    @Override
    public String toCreateColumn(String colName) {
        return toColumnDef(colName, "TIMESTAMP");
    }

    @Override
    public String get(Cursor c, int colNumber) {
        return c.getString(colNumber);
    }
}
