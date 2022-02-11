package example.armeria.server.blog;

public final class BlogPost {
    private final int id;           // The post ID
    private final String title;     // The post Title
    private final String content;   // The post Content
    private final long createAt;    // The time post is created at
    private final long modifiedAt;  // The time post is modified at

    BlogPost(int id, String title, String content) {
        this(id, title, content, System.currentTimeMillis());
    }

    BlogPost(int id, String title, String content, long createAt) {
        this(id, title, content, createAt, createAt);
    }

    BlogPost(int id, String title, String content, long createAt, long modifiedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public long getCreateAt() {
        return createAt;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }
}
