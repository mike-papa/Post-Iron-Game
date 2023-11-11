package com.example.postirongame.controller;

import com.example.postirongame.service.SceneService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;


public class InitialViewController {
    @FXML
    private Label plotDescription;
    private final SceneService sceneService;
    public InitialViewController(SceneService sceneService) {
        this.sceneService = sceneService;
    }

    public void initialize() {
        plotDescription.setText("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ac placerat vestibulum lectus mauris ultrices eros in. Cursus eget nunc scelerisque viverra mauris in aliquam sem. Suspendisse interdum consectetur libero id faucibus. Sapien faucibus et molestie ac feugiat sed lectus vestibulum mattis. Vulputate ut pharetra sit amet aliquam id diam maecenas. Condimentum mattis pellentesque id nibh tortor id. Pulvinar neque laoreet suspendisse interdum consectetur libero id faucibus nisl. Amet nisl suscipit adipiscing bibendum est ultricies integer. Neque aliquam vestibulum morbi blandit cursus. Sed lectus vestibulum mattis ullamcorper velit sed. Vitae ultricies leo integer malesuada nunc vel risus. In hendrerit gravida rutrum quisque. Ullamcorper sit amet risus nullam eget felis. Ut pharetra sit amet aliquam id diam maecenas. Sit amet est placerat in. A condimentum vitae sapien pellentesque habitant.
                Malesuada proin libero nunc consequat interdum. Id diam vel quam elementum pulvinar. Vulputate ut pharetra sit amet aliquam id diam maecenas.
                Dignissim suspendisse in est ante in. Vitae aliquet nec ullamcorper sit amet risus. Pharetra diam sit amet nisl. In iaculis nunc sed augue lacus viverra. Quam vulputate dignissim suspendisse in est ante. Condimentum lacinia quis vel eros. Eu scelerisque felis imperdiet proin fermentum leo. Tincidunt augue interdum velit euismod in pellentesque massa. Suscipit adipiscing bibendum est ultricies integer quis. Vestibulum mattis ullamcorper velit sed ullamcorper morbi. Eu mi bibendum neque egestas congue quisque egestas diam. Non consectetur a erat nam at lectus urna. Cras semper auctor neque vitae tempus quam. Nibh praesent tristique magna sit amet purus gravida.

                Neque egestas congue quisque egestas diam in arcu cursus. Faucibus interdum posuere lorem ipsum dolor sit amet consectetur. Egestas sed tempus urna et pharetra pharetra massa. Tellus elementum sagittis vitae et leo duis ut diam quam. Suspendisse sed nisi lacus sed viverra tellus in. Nullam ac tortor vitae purus faucibus ornare suspendisse sed nisi. Natoque penatibus et magnis dis parturient montes. Dictum varius duis at consectetur lorem donec. Risus nullam eget felis eget nunc lobortis. Egestas quis ipsum suspendisse ultrices gravida dictum fusce ut placerat. Eget lorem dolor sed viverra ipsum nunc aliquet bibendum. Est sit amet facilisis magna etiam tempor orci. Orci a scelerisque purus semper eget duis at tellus at. Amet dictum sit amet justo donec enim diam vulputate. Ante metus dictum at tempor. Magna sit amet purus gravida quis blandit turpis cursus in. Ut sem nulla pharetra diam sit amet. Id faucibus nisl tincidunt eget. Ullamcorper eget nulla facilisi etiam.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.
                Vestibulum rhoncus est pellentesque elit. Enim sit amet venenatis urna. Quam quisque id diam vel quam elementum pulvinar. Curabitur gravida arcu ac tortor dignissim. Pretium quam vulputate dignissim suspendisse in est ante in. Enim sed faucibus turpis in eu. Amet nisl purus in mollis nunc sed id semper. Nunc lobortis mattis aliquam faucibus. Et netus et malesuada fames ac turpis egestas integer. Nec sagittis aliquam malesuada bibendum. Augue eget arcu dictum varius duis at. Auctor augue mauris augue neque gravida in fermentum.
                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.


                Neque egestas congue quisque egestas diam in arcu cursus. Faucibus interdum posuere lorem ipsum dolor sit amet consectetur. Egestas sed tempus urna et pharetra pharetra massa. Tellus elementum sagittis vitae et leo duis ut diam quam. Suspendisse sed nisi lacus sed viverra tellus in. Nullam ac tortor vitae purus faucibus ornare suspendisse sed nisi. Natoque penatibus et magnis dis parturient montes. Dictum varius duis at consectetur lorem donec. Risus nullam eget felis eget nunc lobortis. Egestas quis ipsum suspendisse ultrices gravida dictum fusce ut placerat. Eget lorem dolor sed viverra ipsum nunc aliquet bibendum. Est sit amet facilisis magna etiam tempor orci. Orci a scelerisque purus semper eget duis at tellus at. Amet dictum sit amet justo donec enim diam vulputate. Ante metus dictum at tempor. Magna sit amet purus gravida quis blandit turpis cursus in. Ut sem nulla pharetra diam sit amet. Id faucibus nisl tincidunt eget. Ullamcorper eget nulla facilisi etiam.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Vestibulum rhoncus est pellentesque elit. Enim sit amet venenatis urna. Quam quisque id diam vel quam elementum pulvinar. Curabitur gravida arcu ac tortor dignissim. Pretium quam vulputate dignissim suspendisse in est ante in. Enim sed faucibus turpis in eu. Amet nisl purus in mollis nunc sed id semper. Nunc lobortis mattis aliquam faucibus. Et netus et malesuada fames ac turpis egestas integer. Nec sagittis aliquam malesuada bibendum. Augue eget arcu dictum varius duis at. Auctor augue mauris augue neque gravida in fermentum.
                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.


                Neque egestas congue quisque egestas diam in arcu cursus. Faucibus interdum posuere lorem ipsum dolor sit amet consectetur. Egestas sed tempus urna et pharetra pharetra massa. Tellus elementum sagittis vitae et leo duis ut diam quam. Suspendisse sed nisi lacus sed viverra tellus in. Nullam ac tortor vitae purus faucibus ornare suspendisse sed nisi. Natoque penatibus et magnis dis parturient montes. Dictum varius duis at consectetur lorem donec. Risus nullam eget felis eget nunc lobortis. Egestas quis ipsum suspendisse ultrices gravida dictum fusce ut placerat. Eget lorem dolor sed viverra ipsum nunc aliquet bibendum. Est sit amet facilisis magna etiam tempor orci. Orci a scelerisque purus semper eget duis at tellus at. Amet dictum sit amet justo donec enim diam vulputate. Ante metus dictum at tempor. Magna sit amet purus gravida quis blandit turpis cursus in. Ut sem nulla pharetra diam sit amet. Id faucibus nisl tincidunt eget. Ullamcorper eget nulla facilisi etiam.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Vestibulum rhoncus est pellentesque elit. Enim sit amet venenatis urna. Quam quisque id diam vel quam elementum pulvinar. Curabitur gravida arcu ac tortor dignissim. Pretium quam vulputate dignissim suspendisse in est ante in. Enim sed faucibus turpis in eu. Amet nisl purus in mollis nunc sed id semper. Nunc lobortis mattis aliquam faucibus. Et netus et malesuada fames ac turpis egestas integer. Nec sagittis aliquam malesuada bibendum. Augue eget arcu dictum varius duis at. Auctor augue mauris augue neque gravida in fermentum.
                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.


                Neque egestas congue quisque egestas diam in arcu cursus. Faucibus interdum posuere lorem ipsum dolor sit amet consectetur. Egestas sed tempus urna et pharetra pharetra massa. Tellus elementum sagittis vitae et leo duis ut diam quam. Suspendisse sed nisi lacus sed viverra tellus in. Nullam ac tortor vitae purus faucibus ornare suspendisse sed nisi. Natoque penatibus et magnis dis parturient montes. Dictum varius duis at consectetur lorem donec. Risus nullam eget felis eget nunc lobortis. Egestas quis ipsum suspendisse ultrices gravida dictum fusce ut placerat. Eget lorem dolor sed viverra ipsum nunc aliquet bibendum. Est sit amet facilisis magna etiam tempor orci. Orci a scelerisque purus semper eget duis at tellus at. Amet dictum sit amet justo donec enim diam vulputate. Ante metus dictum at tempor. Magna sit amet purus gravida quis blandit turpis cursus in. Ut sem nulla pharetra diam sit amet. Id faucibus nisl tincidunt eget. Ullamcorper eget nulla facilisi etiam.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Vestibulum rhoncus est pellentesque elit. Enim sit amet venenatis urna. Quam quisque id diam vel quam elementum pulvinar. Curabitur gravida arcu ac tortor dignissim. Pretium quam vulputate dignissim suspendisse in est ante in. Enim sed faucibus turpis in eu. Amet nisl purus in mollis nunc sed id semper. Nunc lobortis mattis aliquam faucibus. Et netus et malesuada fames ac turpis egestas integer. Nec sagittis aliquam malesuada bibendum. Augue eget arcu dictum varius duis at. Auctor augue mauris augue neque gravida in fermentum.
                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                Euismod in pellentesque massa placerat. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Id ornare arcu odio ut sem nulla pharetra diam. Iaculis at erat pellentesque adipiscing commodo elit at. Semper risus in hendrerit gravida. Arcu risus quis varius quam. Ornare lectus sit amet est placerat in egestas erat imperdiet. Eu scelerisque felis imperdiet proin fermentum leo vel. Quis risus sed vulputate odio ut. Dapibus ultrices in iaculis nunc sed. Nibh sit amet commodo nulla facilisi nullam vehicula ipsum a. Fringilla est ullamcorper eget nulla facilisi. Nibh venenatis cras sed felis eget. Interdum varius sit amet mattis vulputate. Suscipit adipiscing bibendum est ultricies integer quis. In vitae turpis massa sed elementum.

                """
        );
    }

    public void onNextButtonClicked(ActionEvent event) throws IOException {
        sceneService.switchScene(event, "game-character-class-select.fxml");
    }
}
