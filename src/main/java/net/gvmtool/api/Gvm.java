/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.gvmtool.api;

/**
 * @author Noam Y. Tenne
 */
public class Gvm {

    public static Use use(String candidateName) {
        return new Use(Context.get(), candidateName);
    }

    public static Install install(String candidateName) {
        return new Install(Context.get(), candidateName);
    }

    public static Uninstall uninstall(String candidateName) {
        return new Uninstall(Context.get(), candidateName);
    }
}
