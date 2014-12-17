/*
 * Copyright 2013 Olivier Croisier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.thecodersbreakfast.restangular.server.rest.application;

import org.restlet.Component;
import org.restlet.Server;
import org.restlet.data.Protocol;

public class RestangularComponent extends Component {

//    //public static void main(String[] args) throws Exception {
//        new RestangularComponent().start();
//    }

    public RestangularComponent() {
        Server server = new Server(Protocol.HTTP, 8000);
        getServers().add(server);
        //server.getContext().getParameters().set("tracing", "true");

        getClients().add(Protocol.CLAP);
        //getClients().add(Protocol.JAR);
        getClients().add(Protocol.OBAP);

        getDefaultHost().attachDefault(new RestangularApplication());

        System.out.println("Server started on port 8000.");
        System.out.println("Application is now available on http://localhost:8000/web/index.html");
    }
}
