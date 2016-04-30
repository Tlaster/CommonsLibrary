/*
 *                 Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2015 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.bluelinelabs.logansquare;

import java.lang.reflect.Type;

/**
 * Created by mariotaku on 15/12/13.
 */
public class Commons_ParameterizedTypeAccessor {

    private Commons_ParameterizedTypeAccessor() {
    }

    public static <T> ParameterizedType<T> create(Type type) {
        return new ParameterizedType.ConcreteParameterizedType<>(type);
    }

}