Sample project showing a limitation of `@SpringBean`.

When given interface has two bean implementing it,
`@SpringBean` is unable to mock it even though one of beans is marked as `@Primary`.