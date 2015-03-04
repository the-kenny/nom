# nom

A Clojure library providing some utility-functions and -macros for Om.

## Usage

### `(cancel-event [e])`

Runs `preventDefault` and `stopPropagation` on event `e`.

### `(with-working [target & body])`

A utility macro that sets the key `:working?` to `true` on `target` (a
Om cursor or `owner`). Useful to disable forms while some operation
(`body`) is running e.g. in a core.async `go` block.

### `defcomponent`

A macro just like `defcomponent` from
[prismatic/om-tools](https://github.com/Prismatic/om-tools) but with
less fancyness (no validation, no mixins). It will also wrap the body
of `render` and `render-state` in `sablono.core/html` allowing you to
write:

```clojure
(defcomponent todo-item [todo]
  (render [_]
    [:li.todo {:class (:state todo)}
     [:.title (:title todo)]
     [:.text  (:text todo)]]))
```

Which will emit:

```clojure
(defn todo-item [todo]
  (reify
    om/IDisplayName
    (display-name [_] "TodoItem")
    om/IRender
    (render [_]
      (html
       [:li.todo {:class (:state todo)}
        [:.title (:title todo)]
        [:.text  (:text todo)]]))))
```

### `defcomponentmethod`

Same as ```defcomponent``` but takes an extra `dispatch-value` arg and
will emit a `defmethod` instead of `defn`.

## License

Copyright © 2015 Moritz Ulrich

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
