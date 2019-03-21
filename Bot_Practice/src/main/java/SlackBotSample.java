import org.riversun.slacklet.Slacklet;
import org.riversun.slacklet.SlackletRequest;
import org.riversun.slacklet.SlackletResponse;
import org.riversun.slacklet.SlackletService;
import org.riversun.xternal.simpleslackapi.SlackChannel;
import org.riversun.xternal.simpleslackapi.SlackSession;
import org.riversun.xternal.simpleslackapi.impl.SlackSessionFactory;

import java.io.IOException;

public class SlackBotSample {
    public static void main(String[] args) throws IOException {
        /*
        String botToken = "xoxb-391697228628-568684645156-yn0TQXsiXUaPfHbIbKSlreZi";

        SlackletService slackletService = new SlackletService(botToken);

        // slackletを追加
        slackletService.addSlacklet(new Slacklet() {

            @Override
            public void onMessagePosted(SlackletRequest req, SlackletResponse resp) {
                // メッセージがユーザからポストされた

                // メッセージがポストされたチャンネルを取得する
                SlackChannel channel = req.getChannel();

                if ("bot_test".equals(channel.getName())) {
                    // bot_testチャンネルで試す

                    // メッセージを取得
                    String content = req.getContent();

                    // メッセージがポストされたチャンネルに対して、BOTからメッセージを送る
                    resp.reply("「" + content + "」って言いましたね。");

                }
            }
        });

        // slackletServiceを開始（slackに接続）
        slackletService.start();
        */
        // BotのAPI Tokenを設定
        SlackSession session = SlackSessionFactory.createWebSocketSlackSession("xoxb-391697228628-568684645156-yn0TQXsiXUaPfHbIbKSlreZi");

        session.connect();

        SlackChannel channel = session.findChannelByName("bot-test");
        String message = "Hello World!";
        session.sendMessage(channel, message);

        session.disconnect();
    }

}
